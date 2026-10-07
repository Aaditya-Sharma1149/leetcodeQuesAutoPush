SELECT a.name
FROM Employee AS a
left JOIN Employee AS b
    ON a.id = b.managerId
GROUP BY a.id, a.name
Having count(a.id) >= 5;
