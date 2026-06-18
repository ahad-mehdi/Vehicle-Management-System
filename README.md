# Vehicle Management System (VMS)

A robust desktop-based application designed to streamline vehicle fleet operations, inventory tracking, and database records management. Built using Java Swing for the graphical interface and phpMyAdmin (MySQL) for relational data persistence.

## 🚀 Features
- **Interactive UI:** Clean, desktop forms built using Java Swing layout managers.
- **CRUD Operations:** Complete functionality to Create, Read, Update, and Delete vehicle records.
- **Relational Database:** Structured MySQL tables handling secure data transactions.
- **Input Validation:** Built-in data checks to prevent SQL injections and formatting errors.

## 🛠️ Tech Stack
- **Language:** Java (JDK 8 or higher)
- **GUI Framework:** Java Swing / AWT
- **Database Architecture:** phpMyAdmin / MySQL Relational DBMS
- **Driver:** JDBC (Java Database Connectivity)

## 📁 Repository Structure
```text
├── src/               # Java source code files (.java)
├── database/          # SQL database export schemas (.sql)
└── screenshots/       # Application UI image previews
```

## ⚙️ Setup and Installation

### 1. Database Configuration
1. Open your local XAMPP/WAMP control panel and start the **Apache** and **MySQL** modules.
2. Navigate to `http://localhost/phpmyadmin/` in your web browser.
3. Create a new database named `vehicle_management`.
4. Click on the **Import** tab, choose the `vehicle_management.sql` file located in the `database/` folder of this repository, and click **Go**.

### 2. Running the Application
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com
   ```
2. Open the project folder in your preferred IDE (NetBeans, IntelliJ, or Eclipse).
3. Ensure the `mysql-connector-java.jar` driver is added to your project's external libraries/build path.
4. Locate the main controller class file inside the `src/` directory and run it.

---
Developed by **Ahad Mehdi** - Computer Science Undergraduate at IoBM.
