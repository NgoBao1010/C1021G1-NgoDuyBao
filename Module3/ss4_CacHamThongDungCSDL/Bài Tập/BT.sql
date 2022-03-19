USE quanlysinhvien;
SELECT `subject`.* FROM `subject` 
WHERE Credit = (SELECT MAX(Credit) FROM `subject`);

SELECT `subject`.* ,mark.Mark FROM `subject`INNER JOIN mark ON `subject`.SubID = mark.SubID
ORDER BY  mark DESC
limit 1;

SELECT student.* , AVG(mark) FROM student INNER JOIN mark ON student.StudentID = mark.StudentID
GROUP BY StudentID ORDER BY  Mark DESC LIMIT 3;