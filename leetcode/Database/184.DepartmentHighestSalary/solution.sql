SELECT D.Name AS Department, E.Name AS Employee, E.Salary AS Salary
  FROM
    Employee E,
	(SELECT Max(Salary) AS MaxSalary, DepartmentId FROM Employee GROUP BY DepartmentId) T,
	Department D
  WHERE E.Salary = T.MaxSalary AND E.DepartmentId = T.DepartmentId AND D.Id = T.DepartmentId;
