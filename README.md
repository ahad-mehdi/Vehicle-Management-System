# Vehicle Management System

A Java Swing desktop application for managing vehicles.  
The system supports **Cars, Trucks, and Motorcycles** and lets users **add, display, search, and delete** vehicle records.

## Features
- Add new vehicles
- Display all stored vehicles
- Search vehicles by registration number
- Delete vehicles by registration number
- Save and load data from a local text file
- Store vehicle records in a MySQL database
- Type-specific fields for each vehicle category

## Tech Stack
- Java
- Swing GUI
- JDBC
- MySQL
- NetBeans

## Vehicle Types
### Car
- Number of doors

### Truck
- Load capacity

### Motorcycle
- Helmet included / not included

## Requirements
- JDK installed
- MySQL installed and running
- MySQL Connector/J
- NetBeans IDE (recommended)

## Setup
1. Clone or download this repository.
2. Create a MySQL database named `vehicle_management`.
3. Make sure the MySQL username and password in `DatabaseManager.java` match your local setup.
4. Update the file path in `VehicleManager.java` if needed.
5. Add the MySQL Connector JAR to the project classpath.
6. Run `VehicleGUI.java`.

## Usage
1. Select a vehicle type.
2. Enter make, model, year, registration number, and extra info.
3. Click **Add Vehicle**.
4. Use **Display Vehicles** to view everything.
5. Use **Search Vehicle** to find one record.
6. Use **Delete Vehicle** to remove a record.

## Project Structure
- `Vehicle.java` – base class
- `Car.java` – car class
- `Truck.java` – truck class
- `Motorcycle.java` – motorcycle class
- `VehicleManager.java` – file/database handling
- `DatabaseManager.java` – MySQL connection and table creation
- `VehicleGUI.java` – Swing interface

## Known Issues / Improvements
- Remove hardcoded file paths
- Add input validation
- Add an update/edit feature
- Improve error messages

## Author
Ahad Mehdi
