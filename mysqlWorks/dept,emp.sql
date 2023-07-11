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

-- 사원 이름이 '한라산'인 사원의 사원 아이디와 부서 아이디를 출력하시오.
select empid as 사원아이디, deptid as 부서아이디 from employee where empname = '한라산';

-- 사원 아이디가 102인 사원의 이름을 '독도'로 나이를 40세로 변경하시오.
update employee set empname = '독도', age = 40 where empid = 102;
update employee set empname = '새로', age = 33 where empid = 102;

-- 트랜 잭션(Transaction) - (실행 - commit, 취소 - rollback)
rollback;
commit;