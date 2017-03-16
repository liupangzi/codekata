SELECT
  D.Name AS Department,
  E.Name AS Employee,
  E.Salary AS Salary
FROM
  Employee E,
  Department D,
  (SELECT
    E2.DepartmentId,
    IFNULL(MAX(E3.Salary), -1) AS 3rdMaxSalary
  FROM (
    SELECT
      E0.DepartmentId,
      MAX(Salary) AS 2ndMaxSalary
    FROM (
      SELECT MAX(Salary) AS MaxSalary, DepartmentId FROM Employee GROUP BY DepartmentId) E0
        LEFT JOIN
      Employee E1
        ON E0.DepartmentId = E1.DepartmentId AND E1.Salary < E0.MaxSalary
      GROUP BY E0.DepartmentId) E2
    LEFT JOIN
      Employee E3
    ON E2.DepartmentId = E3.DepartmentId AND E3.Salary < E2.2ndMaxSalary
  GROUP BY E2.DepartmentId) T
WHERE E.DepartmentId = T.DepartmentId AND T.DepartmentId = D.Id AND E.Salary >= T.3rdMaxSalary
ORDER BY Department, Salary DESC
