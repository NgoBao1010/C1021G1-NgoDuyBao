use quanlysinhvien;

-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi.
select Address, count(StudentID) as 'Số lượng học viên'
from Student
group by Address;

-- Điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
select S.StudentID,S.StudentName,avg(Mark)
from Student S join mark M on S.StudentID = M.StudentId
group by S.StudentID,S.StudentName;

-- Hiển thị các học viên có điểm trung bình các môn học lớn hơn 15
-- Đầu tiên hiển thị điểm trung bình các môn học của mỗi học viên
select S.StudentID,S.StudentName,avg(Mark)
from Student S join mark M on S.StudentID = M.StudentId
group by S.StudentID,S.StudentName;
-- Sử dụng having để xét điều kiện điểm trung bình các môn học phải lớn hơn 15
select S.StudentID,S.StudentName,avg(Mark)
from Student S join mark M on S.StudentID = M.StudentId
group by S.StudentID,S.StudentName
having avg(Mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
-- Hiển thị danh sách điểm trung bình của các học viên
select S.StudentID,S.StudentName,avg(Mark)
from Student S join mark M on S.StudentID = M.StudentId
group by S.StudentID,S.StudentName;

-- Sử dụng Having và All để tìm học viên có điểm trung bình lớn nhất
select S.StudentID,S.StudentName,avg(Mark)
from Student S join mark M on S.StudentID = M.StudentId
group by S.StudentID,S.StudentName
having avg(Mark) >= all (select avg(Mark) from mark group by mark.StudentId);