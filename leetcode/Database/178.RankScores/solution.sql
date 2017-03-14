SELECT s1.Score, s2.Rank FROM Scores s1,
  (SELECT Score, @rownum := @rownum + 1 AS Rank
    FROM (SELECT DISTINCT Score FROM Scores ORDER BY Score DESC) S, (SELECT @rownum := 0) r ORDER BY Score DESC
  ) s2
WHERE s1.Score = s2.Score ORDER BY Rank;
