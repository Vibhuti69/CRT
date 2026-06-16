-- ============================================
-- Tailor Management System - Sample Data
-- ============================================

-- ============================================
-- Sample Customers
-- ============================================
INSERT INTO customers (name, mobile, address) VALUES
    ('Rajesh Kumar',    '9876543210', '12, Gandhi Nagar, Nagpur'),
    ('Priya Sharma',    '9821456780', '45, Laxmi Road, Pune'),
    ('Amit Patil',      '9988776655', '78, MG Road, Mumbai'),
    ('Sunita Deshpande','9765432109', '23, Civil Lines, Amravati'),
    ('Vikram Singh',    '9654321098', '56, Sadar Bazaar, Nashik'),
    ('Meena Joshi',     '9543210987', '90, Tilak Nagar, Aurangabad'),
    ('Ravi Gupta',      '9432109876', '34, Station Road, Akola'),
    ('Anita More',      '9321098765', '67, Dharampeth, Nagpur');

-- ============================================
-- Sample Orders
-- ============================================
INSERT INTO orders (customer_id, garment_type, order_date, delivery_date, status, amount) VALUES
    (1, 'Suit',          '2024-12-01', '2024-12-10', 'Completed', 3500.00),
    (1, 'Kurta Pyjama',  '2025-01-05', '2025-01-15', 'Pending',   1200.00),
    (2, 'Blouse',        '2024-12-15', '2024-12-22', 'Completed', 800.00),
    (2, 'Salwar Kameez', '2025-01-10', '2025-01-20', 'Pending',   2200.00),
    (3, 'Sherwani',      '2024-11-20', '2024-12-01', 'Completed', 5000.00),
    (3, 'Trousers',      '2025-01-12', '2025-01-22', 'Pending',   900.00),
    (4, 'Saree Blouse',  '2025-01-03', '2025-01-08', 'Completed', 600.00),
    (4, 'Lehenga',       '2025-01-15', '2025-02-01', 'Pending',   8500.00),
    (5, 'Shirt',         '2025-01-08', '2025-01-13', 'Completed', 700.00),
    (6, 'Anarkali Suit', '2025-01-14', '2025-01-25', 'Pending',   3200.00),
    (7, 'Pant Coat',     '2024-12-28', '2025-01-05', 'Completed', 4200.00),
    (8, 'Kurti',         '2025-01-16', '2025-01-23', 'Pending',   1100.00);
