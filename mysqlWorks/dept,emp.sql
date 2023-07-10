-- 부서와 사원 테이블
use mydb;

create table department(
	deptid int primary key,
    deptname varchar(30) not null,
    location varchar(20) not null
);

-- 사원 테이블
create table employee(
	empid INT primary key,
    empname VARCHAR(30) not null,
    age INT,
    deptid INT NOT NULL,
    constraint fk_dept_employee foreign key(deptid)
    references department(deptid)	-- 관계 설정(외래키)
);

-- 부서 추가
insert into department values(10, '개발팀', '서울');
insert into department values(20, '디자인팀', '성남');

-- 사원 추가
insert into employee values(101, '한라산', 27, 10);
insert into employee values(102, '새로', 19, 20);
insert into employee values(103, '서해', 23, 30);

-- 부서 검색
select * from department;

-- 사원 검색
select * from employee;