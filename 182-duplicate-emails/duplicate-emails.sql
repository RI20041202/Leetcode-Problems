# Write your MySQL query statement below
select Email
from Person
Group by Email
Having count(Email)>1;