# ✂️ Tailor Management System

A full-stack web application built with **Java Spring Boot** and **PostgreSQL** for managing a tailor shop's customers and orders. Designed as a clean, professional college project and GitHub portfolio piece.

---

## 📌 Project Description

The **Tailor Management System** is a simple yet professional web application that helps tailor shop owners manage their daily operations. It provides an intuitive interface to track customers, manage orders, and monitor business activity through a clean dashboard.

This project demonstrates:
- Full-stack Java web development
- RESTful API design
- Database design with proper relationships
- Modern, responsive UI without any frontend framework
- Clean code architecture with proper separation of concerns

---

## ✨ Features

### 🏠 Dashboard
- Total customers, orders, pending, and completed counts
- Recent orders table at a glance
- Animated stat cards with live data

### 👥 Customer Management
- Add, edit, delete customers
- Search by name or mobile number
- View full customer list with pagination-ready layout

### 📋 Order Management
- Add, edit, delete orders
- Assign orders to customers
- Track garment type, dates, amount, and status
- Filter orders by keyword (customer name or garment type)
- Order status tracking: **Pending** / **Completed**

---

## 🛠️ Tech Stack

| Layer       | Technology                           |
|-------------|--------------------------------------|
| Backend     | Java 17, Spring Boot 3               |
| Persistence | Spring Data JPA, Hibernate           |
| Database    | PostgreSQL                           |
| Frontend    | HTML5, CSS3, JavaScript (Vanilla)    |
| Build Tool  | Apache Maven                         |
| Templating  | Thymeleaf (for serving HTML pages)   |

---





## 📁 Project Structure

```
TailorManagementSystem/
├── src/
│   └── main/
│       ├── java/com/tailor/management/
│       │   ├── TailorManagementApplication.java    ← Main class
│       │   ├── entity/
│       │   │   ├── Customer.java                   ← Customer entity
│       │   │   └── Order.java                      ← Order entity
│       │   ├── repository/
│       │   │   ├── CustomerRepository.java          ← Customer data access
│       │   │   └── OrderRepository.java             ← Order data access
│       │   ├── service/
│       │   │   ├── CustomerService.java             ← Customer business logic
│       │   │   └── OrderService.java                ← Order business logic
│       │   ├── controller/
│       │   │   ├── CustomerController.java          ← Customer REST API
│       │   │   ├── OrderController.java             ← Order REST API
│       │   │   └── PageController.java              ← HTML page routing
│       │   └── exception/
│       │       ├── GlobalExceptionHandler.java       ← Error handling
│       │       └── ResourceNotFoundException.java    ← Custom exception
│       └── resources/
│           ├── application.properties               ← App configuration
│           ├── static/
│           │   ├── css/
│           │   │   └── style.css                    ← Stylesheet
│           │   └── js/
│           │       └── app.js                       ← JavaScript utilities
│           └── templates/
│               ├── dashboard.html                   ← Dashboard page
│               ├── customers.html                   ← Customers page
│               └── orders.html                      ← Orders page
├── schema.sql               ← Database schema
├── data.sql                 ← Sample data
├── pom.xml                  ← Maven dependencies
├── .gitignore
└── README.md
```

---

## 🔮 Future Improvements

- [ ] Measurements module (chest, waist, shoulder, etc.)
- [ ] Invoice / bill generation (PDF export)
- [ ] SMS / WhatsApp notification on order ready
- [ ] Payment tracking (advance / due amount)
- [ ] Staff management module
- [ ] Monthly revenue reports with charts
- [ ] Login / authentication system
- [ ] Dark mode toggle

---


