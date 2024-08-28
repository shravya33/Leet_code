# Write your MySQL query statement below
select a1.machine_id, 
round((select avg(a2.timestamp) from Activity a2 where a2.activity_type = 'end' and a2.machine_id = a1.machine_id) - (select avg(a2.timestamp) from Activity a2 where a2.activity_type = 'start' and a2.machine_id = a1.machine_id) ,3) as processing_time from Activity a1 group by a1.machine_id