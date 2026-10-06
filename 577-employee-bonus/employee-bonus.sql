# Write your MySQL query statement below
Select e.name , b.bonus
From Employee as e
left Join  Bonus as b on e.empId = b.empId
where   b.bonus is null OR b.bonus < 1000;

 