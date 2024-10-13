# Write your MySQL query statement below
select s.student_id,student_name , sub.subject_name,count(e.student_id) as attended_exams
from Students as s join Subjects as sub left join Examinations as e  
on s.student_id =e.student_id and sub.subject_name =e.subject_name
group by student_id ,subject_name,sub.subject_name 
order by student_id ,subject_name