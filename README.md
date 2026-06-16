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

## 📸 Screenshots

> Add screenshots of your running application here.

| Dashboard | Customers | Orders |
|-----------|-----------|--------|
| ![Dashboard](screenshots/dashboard.png) | ![Customers](screenshots/customers.png) | ![Orders](screenshots/orders.png) |

---

## 🗄️ Database Setup

### 1. Install PostgreSQL

Download and install PostgreSQL from https://www.postgresql.org/download/

### 2. Create the Database

Open `psql` or pgAdmin and run:

```sql
CREATE DATABASE tailor_management;
```

### 3. Run the Schema

```bash
psql -U postgres -d tailor_management -f schema.sql
```

### 4. (Optional) Load Sample Data

```bash
psql -U postgres -d tailor_management -f data.sql
```

> **Note:** If you set `spring.jpa.hibernate.ddl-auto=update` in `application.properties` (default), Spring Boot will auto-create the tables on first run. The `schema.sql` is provided for manual setup or reference.

---

## ⚙️ Installation & Setup

### Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL 13+

### Steps

**1. Clone the repository**

```bash
git clone https://github.com/your-username/TailorManagementSystem.git
cd TailorManagementSystem
```

**2. Configure the database**

Edit `src/main/resources/application.properties` if your credentials differ:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tailor_management
spring.datasource.username=postgres
spring.datasource.password=postgres
```

**3. Build the project**

```bash
mvn clean install
```

**4. Run the application**

```bash
mvn spring-boot:run
```

**5. Open in browser**

```
http://localhost:8080
```

---

## 🚀 How To Run

```bash
# Clone the repo
git clone https://github.com/your-username/TailorManagementSystem.git

# Navigate into the project
cd TailorManagementSystem

# Create database in PostgreSQL
psql -U postgres -c "CREATE DATABASE tailor_management;"

# (Optional) Apply schema manually
psql -U postgres -d tailor_management -f schema.sql

# (Optional) Load sample data
psql -U postgres -d tailor_management -f data.sql

# Run the Spring Boot application
mvn spring-boot:run

# Visit http://localhost:8080
```

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

## 👤 Author

**Shivam Yerne**  
Computer Science Engineering (Final Year)  
G H Raisoni University, Amravati

- GitHub: [github.com/shivam1-bit](https://github.com/shivam1-bit)
- LinkedIn: [linkedin.com/in/shivamyerne](https://linkedin.com/in/shivamyerne)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
