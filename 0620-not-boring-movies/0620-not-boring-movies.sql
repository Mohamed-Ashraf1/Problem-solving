# Write your MySQL query statement below
select * from Cinema where description != 'boring' having mod(id,2)!=0 order by rating desc
