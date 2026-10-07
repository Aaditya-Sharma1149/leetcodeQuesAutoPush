SELECT name
FROM (
    SELECT 
        a.name,
        COUNT(b.id) AS freq
    FROM Employee AS a
    JOIN Employee AS b
        ON a.id = b.managerId
    GROUP BY a.id, a.name
) AS t
WHERE freq >= 5;