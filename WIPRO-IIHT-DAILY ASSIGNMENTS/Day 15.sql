Create database employeeDB;
Show databases;
select database();
use employeeDB;
CREATE table Employees(
emp_id INT primary KEY,
emp_name varchar (80),
department varchar(100),
salary decimal(10, 2),
email varchar(200),
joining_date DATE
);

INSERT INTO Employees(emp_id, emp_name, department, salary, email, joining_date)
values
(102, 'Kumar Shanu', 'IT', 400000, 'shanugn989@gmail.com', '2026-06-22'),
(103, 'alpha', 'IT', 0, ' ', '2026-06-22'),
(104, 'aryan', 'IT', 6222000, 'aryanr@gmail.com', '2026-06-22'),
(105, 'aman', 'IT', 150, 'rajaman@gmail.com', '2026-06-22');
select * from Employees;
SELECT emp_name, department, email FROM Employees;
UPDATE Employees SET salary = salary - 6200000 WHERE emp_id = 104;
DELETE FROM Employees WHERE emp_id = 103;
SELECT * FROM Employees ORDER BY salary DESC;
SELECT * FROM Employees LIMIT 2;
SELECT COUNT(emp_id) AS total_employees FROM Employees;
SELECT AVG(salary) AS average_salary FROM Employees;
SELECT MAX(salary) AS highest_salary, MIN(salary) AS lowest_salary FROM Employees;
SELECT department, COUNT(*) FROM Employees GROUP BY department;

SELECT department, AVG(salary) FROM Employees 
GROUP BY department 
HAVING AVG(salary) > 5000;

SELECT * FROM Employees WHERE email IS NULL;

INSERT INTO Employees(emp_id, emp_name, department, salary, email, joining_date) VALUES
(106, 'Rahul', 'Testing', 45000, 'rahul@gmail.com', '2026-01-10'),
(107, 'Riya', 'HR', 55000, NULL, '2026-02-15'),
(108, 'Suresh', 'Testing', 48000, 'suresh@gmail.com', '2026-03-20'),
(109, 'Rohan', 'HR', 60000, 'rohan@gmail.com', '2026-04-05'),
(110, 'Duplicate', 'IT', 30000, 'shanugn989@gmail.com', '2026-05-01');

SELECT * FROM Employees WHERE department = 'IT';
UPDATE Employees SET salary = salary + 2000 WHERE department = 'Testing';
DELETE FROM Employees WHERE emp_id = 105;

