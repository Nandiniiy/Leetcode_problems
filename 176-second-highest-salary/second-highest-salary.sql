# Write your MySQL query statement below
#select (select distinct emp.salary as SecondHighestSalary from Employee as emp order by salary desc limit 1,1) as #SecondHighestSalary; 
# Write your MySQL query statement below

SELECT  MAX(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY <>(SELECT MAX(SALARY) FROM EMPLOYEE);