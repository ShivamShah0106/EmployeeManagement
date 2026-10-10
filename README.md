# Employee Management System (CLI)

A lightweight, console-based **Employee Management System** written in Java. This application demonstrates core structural and object-oriented programming concepts (OOP) by allowing users to manage employee records dynamically through a Command Line Interface (CLI).

---

## 🚀 Features

The application supports full **CRUD-like** operations handled sequentially within a clean interactive terminal menu loop:

- **Build Database (Batch Insert):** Instantly initialize the employee registry with multiple sequential records up to a predefined limit.
- **Insert New Records:** Add single employee records dynamically into the registry without overwriting existing data.
- **Search Functionality:** Find any employee instantly using an ID-based matching system.
- **Shift-Safe Record Deletion:** Remove an employee record by ID while shifting adjacent array entries dynamically to maintain structural indices and avoid gaps.

---

## 🛠️ Object-Oriented Principles Implemented

This project showcases a complete refactoring from structural script patterns to strict production-ready Java patterns:
* **Encapsulation:** Employee attributes (`name`, `id`, `designation`, `age`, `exp`) are private data members protected against accidental state mutation.
* **Data Accessors:** Data fields are securely extracted using immutable public getter methods.
* **Constructors:** All object initializations are fully bound inside a parameterised constructor, mitigating the risk of `NullPointerException` errors.

---

## 📦 Project Setup & Execution

### Prerequisites
Make sure you have the Java Development Kit (JDK 8 or higher) installed on your machine.

### Compilation
Open your terminal inside the project directory and run:
```bash
javac EmployeeManagement.java
```

### Running the Application
Launch the program using:
```bash
java EmployeeManagement
```

---

## 📋 Sample Menu Overview

```text
--------------------Welcome to the Employee Management System--------------------

Available Options:
Build Table       (1)
Insert New Entry  (2)
Delete Entry      (3)
Search Record     (4)
Exit              (5)
```

---

## 📄 License
This repository is open-source and free to use for educational purposes.
