SELECT
  DISTINCT L.Num AS ConsecutiveNums
FROM
  Logs L INNER JOIN (SELECT L2.Id, L2.Num FROM Logs L1 INNER JOIN Logs L2 ON L1.Id + 1 = L2.Id AND L1.Num = L2.Num) T
ON T.Id + 1 = L.Id AND T.Num = L.Num;
