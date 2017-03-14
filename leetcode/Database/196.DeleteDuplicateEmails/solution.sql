DELETE FROM Person WHERE Id NOT IN (
  SELECT minID FROM (
    SELECT Min(Id) AS minID FROM Person
      WHERE Email In (SELECT DISTINCT Email FROM Person)
      GROUP BY Email
  ) Q
)


-- OR:
-- DELETE p1 FROM Person p1, Person p2 WHERE p1.Email = p2.Email AND p1.Id > p2.Id
