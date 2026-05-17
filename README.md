# Dormitory Management System 

A Java-based console application designed to manage dormitory room allocations, strictly applying Object-Oriented Programming (OOP) principles. This project demonstrates in-memory data management, robust validation, and File I/O operations.

## Key Features

* **Interactive CLI Menu:** A continuous loop console interface for managing the dormitory system.
* **Room Management:** Dynamically add new rooms with specific maximum capacities.
* **Student Assignment:** Register and assign new students to specific rooms.
* **Relocation Logic:** Move students between rooms with strict capacity and availability validations.
* **Real-time Status Tracking:** View available rooms (filtered by free spots) and display the complete dormitory occupancy status.
* **Data Persistence:** Automatically exports the current dormitory status to a `dorm_status.txt` file upon a graceful system shutdown.

## Technologies & Concepts Used

* **Language:** Java
* **Core Concepts:** * Object-Oriented Programming (Encapsulation, Data Abstraction)
  * Dynamic Memory Management (using `ArrayList` collections)
  * Exception Handling (`try-catch` blocks for File I/O)
  * Data Validation (Null checks, preventing `NullPointerException`)
* **Libraries:** `java.util.Scanner`, `java.util.ArrayList`, `java.io.FileWriter`, `java.io.IOException`

## Project Structure

The project is built using a modular class architecture:
* `Main.java` - The entry point containing the interactive Command Line Interface (CLI).
* `DormitoryManager.java` - The central controller handling the logic for finding, allocating, and exporting data.
* `Dorm.java` - Represents a room, managing its specific capacity and a dynamic list of assigned students.
* `Student.java` - The foundational entity representing a student's data.

## How to Run

1. Clone this repository to your local machine.
2. Compile the Java files.
3. Run the `Main` class.
4. Follow the on-screen interactive menu to manage the dormitory.
5. Select option `0` to exit the program and automatically generate the `dorm_status.txt` report.
