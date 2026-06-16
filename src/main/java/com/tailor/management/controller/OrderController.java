package com.tailor.management.controller;

import com.tailor.management.entity.Order;
import com.tailor.management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // GET all orders
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    // GET order by ID
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = orderService.getOrderById(id);
        return ResponseEntity.ok(order);
    }

    // POST add new order
    @PostMapping
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        Order saved = orderService.addOrder(order);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // PUT update order
    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id,
                                              @RequestBody Order order) {
        Order updated = orderService.updateOrder(id, order);
        return ResponseEntity.ok(updated);
    }

    // DELETE order
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted successfully");
    }

    // GET search orders
    @GetMapping("/search")
    public ResponseEntity<List<Order>> searchOrders(@RequestParam String keyword) {
        List<Order> orders = orderService.searchOrders(keyword);
        return ResponseEntity.ok(orders);
    }

    // GET recent orders (for dashboard)
    @GetMapping("/recent")
    public ResponseEntity<List<Order>> getRecentOrders(@RequestParam(defaultValue = "5") int limit) {
        List<Order> orders = orderService.getRecentOrders(limit);
        return ResponseEntity.ok(orders);
    }

    // GET dashboard stats
    @GetMapping("/stats")
    public ResponseEntity<java.util.Map<String, Long>> getStats() {
        java.util.Map<String, Long> stats = new java.util.HashMap<>();
        stats.put("total", orderService.getTotalOrders());
        stats.put("pending", orderService.getPendingOrders());
        stats.put("completed", orderService.getCompletedOrders());
        return ResponseEntity.ok(stats);
    }
}
