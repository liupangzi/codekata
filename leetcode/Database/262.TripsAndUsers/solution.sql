SELECT
  Request_at AS Day,
  ROUND(COUNT(IF(Status != 'completed', TRUE, NULL)) / COUNT(*), 2) AS `Cancellation Rate`
FROM Trips T INNER JOIN Users U ON T.Client_Id = U.Users_Id AND U.Banned = 'No'
  WHERE Request_at BETWEEN '2013-10-01' AND '2013-10-03' GROUP BY Request_at
