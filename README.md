# Student Management System - JDBC

A console-based Student Management System built using Java, JDBC, and MySQL.

## Features
- Add student
- View all students
- Find student by ID
- Update student details
- Delete student

## Tech Stack
- Java
- JDBC
- MySQL
- Eclipse IDE

## Database Schema

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(50),
    marks INT
);

## How to Run

1. Create a MySQL database named `student_db`
2. Create the `students` table using the schema below
3. Update database credentials in `DBConnection.java`
4. Run `Main.java` from Eclipse (or any Java IDE)

## Learning Outcome

This project helped me understand the JDBC workflow, usage of `PreparedStatement`, CRUD operations, and how to structure code using a simple DAO pattern.

