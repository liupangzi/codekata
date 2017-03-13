SELECT E1.Name AS Employee
  FROM Employee E1 INNER JOIN Employee E2 ON E2.Id = E1.ManagerId 
WHERE E1.Salary > E2.Salary;
