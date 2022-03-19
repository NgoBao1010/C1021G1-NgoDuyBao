use quanlysinhvien;
select * from student;

select * from student where Status = true;

select * from subject where Credit < 10;

select S.StudentId, S.StudentName, C.ClassName
from student S join class C on S.ClassID = C.ClassID
where C.ClassName = 'A1';

select S.StudentId, S.StudentName, Sub.SubName, M.mark
from student S join mark M on S.StudentId = M.StudentId join subject Sub on M.SubId = Sub.SubId
where Sub.SubName = 'CF';
