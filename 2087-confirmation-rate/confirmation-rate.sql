# Write your MySQL query statement below
select s.user_id , coalesce(round(sum(c.action ="confirmed") / count(s.user_id),2),0 )as confirmation_rate
from Signups as s
Left join Confirmations as c
    on s.user_id = c.user_id
group by s.user_id;