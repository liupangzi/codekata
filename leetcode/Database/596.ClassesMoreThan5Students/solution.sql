SELECT class FROM courses GROUP BY class HAVING count(distinct(student)) > 4;
