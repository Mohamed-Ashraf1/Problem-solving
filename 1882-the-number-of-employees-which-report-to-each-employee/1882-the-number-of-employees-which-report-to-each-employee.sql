# Write your MySQL query statement below
select m.employee_id , m.name ,count(e.reports_to) as 'reports_count', round(avg(e.age)) as average_age  from Employees as e join Employees as m on e.reports_to = m.employee_id
group by e.reports_to 
order by employee_id
