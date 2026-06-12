CREATE DATABASE day17;
USE day17;

CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

select * from employee;

SELECT COUNT(*) AS total_employees
FROM Employee;

CREATE TABLE Users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);