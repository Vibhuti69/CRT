-- ============================================
-- Tailor Management System - Database Schema
-- PostgreSQL
-- ============================================

-- Create Database (run this separately if needed)
-- CREATE DATABASE tailor_management;

-- ============================================
-- Customers Table
-- ============================================
CREATE TABLE IF NOT EXISTS customers (
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(100) NOT NULL,
    mobile   VARCHAR(15)  NOT NULL,
    address  VARCHAR(255)
);

-- ============================================
-- Orders Table
-- ============================================
CREATE TABLE IF NOT EXISTS orders (
    id            BIGSERIAL PRIMARY KEY,
    customer_id   BIGINT       NOT NULL,
    garment_type  VARCHAR(100) NOT NULL,
    order_date    DATE         NOT NULL,
    delivery_date DATE,
    status        VARCHAR(20)  NOT NULL DEFAULT 'Pending',
    amount        NUMERIC(10, 2),

    -- Foreign key constraint
    CONSTRAINT fk_customer
        FOREIGN KEY (customer_id)
        REFERENCES customers(id)
        ON DELETE CASCADE
);

-- ============================================
-- Indexes for performance
-- ============================================
CREATE INDEX IF NOT EXISTS idx_orders_customer_id ON orders(customer_id);
CREATE INDEX IF NOT EXISTS idx_orders_status       ON orders(status);
CREATE INDEX IF NOT EXISTS idx_customers_mobile    ON customers(mobile);
