package com.tailor.management.service;

import com.tailor.management.entity.Customer;
import com.tailor.management.entity.Order;
import com.tailor.management.exception.ResourceNotFoundException;
import com.tailor.management.repository.CustomerRepository;
import com.tailor.management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with ID: " + id));
    }

    // Add new order
    public Order addOrder(Order order) {
        // Ensure customer exists
        Customer customer = customerRepository.findById(order.getCustomer().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        order.setCustomer(customer);
        return orderRepository.save(order);
    }

    // Update existing order
    public Order updateOrder(Long id, Order updatedOrder) {
        Order existing = getOrderById(id);

        // Update customer if changed
        Customer customer = customerRepository.findById(updatedOrder.getCustomer().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));

        existing.setCustomer(customer);
        existing.setGarmentType(updatedOrder.getGarmentType());
        existing.setOrderDate(updatedOrder.getOrderDate());
        existing.setDeliveryDate(updatedOrder.getDeliveryDate());
        existing.setStatus(updatedOrder.getStatus());
        existing.setAmount(updatedOrder.getAmount());

        return orderRepository.save(existing);
    }

    // Delete order
    public void deleteOrder(Long id) {
        Order order = getOrderById(id);
        orderRepository.delete(order);
    }

    // Search orders
    public List<Order> searchOrders(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getAllOrders();
        }
        return orderRepository.searchOrders(keyword.trim());
    }

    // Get recent orders for dashboard
    public List<Order> getRecentOrders(int limit) {
        return orderRepository.findRecentOrders(PageRequest.of(0, limit));
    }

    // Get total order count
    public long getTotalOrders() {
        return orderRepository.count();
    }

    // Get pending orders count
    public long getPendingOrders() {
        return orderRepository.countByStatus("Pending");
    }

    // Get completed orders count
    public long getCompletedOrders() {
        return orderRepository.countByStatus("Completed");
    }
}
