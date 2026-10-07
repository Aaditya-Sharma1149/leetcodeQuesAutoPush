SELECT 
    b.machine_id,
    ROUND(
        (SUM(b.timestamp) - SUM(a.timestamp)) / COUNT(b.machine_id),
        3
    ) AS processing_time
FROM Activity AS a
JOIN Activity AS b
    ON a.machine_id = b.machine_id
    AND a.process_id = b.process_id
WHERE a.activity_type = 'start'
  AND b.activity_type = 'end'
GROUP BY b.machine_id;