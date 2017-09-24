SELECT s.id, IF(MOD(s.id, 2) = 1, IFNULL(n.student, s.student), p.student) AS student
FROM seat s
LEFT JOIN seat p ON s.id - 1 = p.id
LEFT JOIN seat n ON s.id + 1 = n.id
ORDER BY id;
