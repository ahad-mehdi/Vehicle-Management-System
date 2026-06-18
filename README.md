# Vehicle Management System (VMS)

A robust full-stack desktop management application designed to handle fleet inventory data securely. The project showcases production-ready Object-Oriented Programming (OOP) architectures, clean desktop User Interfaces (UI), and a resilient dual-layer data persistence engine.

## 🚀 Architectural Blueprint

This project moves past basic CRUD by implementing strict software engineering design patterns:
- **Abstraction & Interfaces:** Uses a core `Displayable` interface and an abstract parent `Vehicle` class to dictate uniform structure across multiple vehicle types.
- **Inheritance & Polymorphism:** Scaled with specialized concrete classes (`Car`, `Truck`, `Motorcycle`) that override polymorphic execution boundaries like `displayInfo()`.
- **Dual-Layer Persistence:** Guarantees zero data loss by recording transactions to local flat-text files (`vehicles.txt`) while concurrently pushing structured records to an relational schema.

## 🛠️ Complete Tech Stack
- **Languages:** Java (JDK 8+), SQL
- **Front-End Framework:** Java Swing UI / AWT Event Modeling
- **Relational DBMS:** MySQL via XAMPP / phpMyAdmin Core Engine
- **Data Drivers:** JDBC (Java Database Connectivity)
- **File Utilities:** Java File I/O (`BufferedReader` / `BufferedWriter`)

## 📁 Source Architecture
```text
├── database/          
│   └── vehicle_management.sql  # Database configuration schema
├── src/               
│   ├── Vehicle.java            # Abstract Parent Base Class
│   ├── Displayable.java        # Strict Behavioral Interface
│   ├── Car.java                # Child Class: Automotive specs
│   ├── Truck.java              # Child Class: Heavy logistics specs
│   ├── Motorcycle.java         # Child Class: Two-wheeler specs
│   ├── VehicleManager.java     # Logic Hub: Core CRUD, File I/O, DB handlers
│   ├── DatabaseManager.java    # Driver Utility: Dynamic Connection Pipelines
│   └── VehicleGUI.java         # Presentation Layer: Java Swing Layouts
└── vehicles.txt                # Flat-file backup logging layer
```

## ⚙️ Direct Setup & System Deployment

### 1. Schema Injection
1. Fire up **XAMPP/WAMP** and run the `Apache` and `MySQL` ports.
2. Route to your local browser panel: `http://localhost/phpmyadmin/`.
3. Provision an empty schema called `vehicle_management`.
4. Tap the **Import** header, upload the structural script from `/database/vehicle_management.sql`, and press **Go**.

### 2. Local App Compilation
1. Run a local clone command inside your system terminal:
   ```bash
   git clone https://github.com
   ```
2. Build the project folder inside your preferred development platform (NetBeans, IntelliJ, or Eclipse).
3. Bind the missing external component driver `mysql-connector-java.jar` to your IDE Build Path.
4. Execute `VehicleGUI.java` to start up the running desktop dashboard application interface.

---
Developed for Semester Examination Metrics at **Institute of Business Management (IoBM)**.
