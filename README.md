A full stack School Management System built using Java, Servlets, JDBC, JSP, and PostgreSQL to perform CRUD operations on student data.

### 💻 Tech Stack:
- Backend: Java, Servlets, JDBC
- Frontend: JSP, HTML
- Database: PostgreSQL
- Server: Apache Tomcat

### ✅ Features:
- Register new students with ID, name, age, and class
- Display all student records in a styled HTML table
- Edit and update student details
- Delete student records
- Dynamic links to Edit/Delete using servlet routing

### 📁 Core Packages:
- `com.schoolmanagementt.controller`: Servlets (Register, Update, Delete, Display)
- `com.schoolmanagementt.entity`: Student model class
- `com.schoolmanagementt.service`: JDBC logic and database operations

### 📂 Folder Structure:
School-Management-System-Java/
├── src/
│   └── com/schoolmanagementt/
│       ├── controller/
│       │   ├── Register.java
│       │   ├── Update.java
│       │   ├── Delete.java
│       │   └── Display.java
│       ├── entity/
│       │   └── Student.java
│       └── service/
│           └── StudentService.java
│
├── web/
│   ├── welcome.jsp
│   ├── registration.jsp
│   ├── edit.jsp
│   └── delete.jsp
│
├── README.md
└── database/
    └── init.sql
