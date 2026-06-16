package com.tailor.management.repository;

import com.tailor.management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Find orders by customer ID
    List<Order> findByCustomerId(Long customerId);

    // Find orders by status
    List<Order> findByStatus(String status);

    // Search orders by garment type or customer name
    @Query("SELECT o FROM Order o JOIN o.customer c WHERE " +
           "LOWER(o.garmentType) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
           "OR LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Order> searchOrders(@Param("keyword") String keyword);

    // Get recent orders (latest 5)
    @Query("SELECT o FROM Order o ORDER BY o.orderDate DESC")
    List<Order> findRecentOrders(org.springframework.data.domain.Pageable pageable);

    // Count orders by status
    long countByStatus(String status);
}
