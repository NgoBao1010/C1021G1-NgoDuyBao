USE quanlysinhvien;
SELECT student.* FROM quanlysinhvien.student WHERE student.StudentName LIKE "H%";
SELECT class.* FROM quanlysinhvien.class  WHERE class.StartDate LIKE '____-12%';
SELECT class.* FROM  quanlysinhvien.class WHERE month(StartDate) = 12;
SELECT * FROM subject WHERE Credit BETWEEN 3 AND 5;
SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET ClassID = 2 WHERE StudentName = "Hung";
SET SQL_SAFE_UPDATES = 1;
SELECT * FROM student;
SELECT student.StudentName, `subject`.SubName, mark.Mark  FROM student INNER JOIN  mark ON student.StudentId = mark.StudentId 
INNER JOIN `subject` 
ON mark.SubID = `subject`.SubID
ORDER BY  mark DESC, student.StudentName ASC;