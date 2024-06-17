# Write your MySQL query statement below
SELECT p.firstname, p.lastname, s.city, s.state 
from person p 
LEFT JOIN address s
ON p.personId = s.personId;