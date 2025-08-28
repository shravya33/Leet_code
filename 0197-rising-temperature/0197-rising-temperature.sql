# Write your MySQL query statement below
select today.id
from Weather yesterday cross join Weather today 
where datediff(today.recordDate, yesterday.recordDate) = 1 
and today.temperature > yesterday.temperature;