package com.tailor.management.service;

import com.tailor.management.entity.Customer;
import com.tailor.management.exception.ResourceNotFoundException;
import com.tailor.management.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get customer by ID
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with ID: " + id));
    }

    // Add new customer
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Update existing customer
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer existing = getCustomerById(id);
        existing.setName(updatedCustomer.getName());
        existing.setMobile(updatedCustomer.getMobile());
        existing.setAddress(updatedCustomer.getAddress());
        return customerRepository.save(existing);
    }

    // Delete customer
    public void deleteCustomer(Long id) {
        Customer customer = getCustomerById(id);
        customerRepository.delete(customer);
    }

    // Search customers
    public List<Customer> searchCustomers(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getAllCustomers();
        }
        return customerRepository.searchCustomers(keyword.trim());
    }

    // Get total customer count
    public long getTotalCustomers() {
        return customerRepository.count();
    }
}
