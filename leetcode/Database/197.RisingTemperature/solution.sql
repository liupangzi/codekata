SELECT W2.Id
  FROM Weather W1 INNER JOIN Weather W2 ON W1.Date = DATE_ADD(W2.Date, INTERVAL -1 DAY)
WHERE W1.Temperature < W2.Temperature;
