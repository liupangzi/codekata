SELECT Person.FirstName AS FirstName, Person.LastName AS LastName, Address.City AS City, Address.State AS State
    FROM Person
LEFT JOIN Address
    ON Person.PersonId = Address.PersonId;
