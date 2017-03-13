SELECT Name AS `Customers` 
  FROM Customers LEFT JOIN Orders ON Orders.CustomerId = Customers.Id
WHERE CustomerId IS NULL;
