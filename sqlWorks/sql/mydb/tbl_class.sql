-- 학과 테이블
CREATE TABLE tbl_class (
    cid       NUMBER(3) PRIMARY KEY,    -- 학과코드(기본키)
    cname     VARCHAR2(30) NOT NULL,    -- 학과명
    ctel      VARCHAR2(15) NOT NULL,    -- 학과전화번호
    clocation VARCHAR2(20) NOT NULL     -- 학과사무실위치
);

-- 학과 자료 삽입
INSERT INTO tbl_class
    VALUES (101, '소프트웨어학과', '02-1234-1234', 'B동 3층');
INSERT INTO tbl_class
    VALUES (102, '화학공학과', '02-1234-4567', 'B동 4층');
INSERT INTO tbl_class
    VALUES (103, '전기전자공학과', '02-1234-5678', 'B동 5층');

-- 학과 테이블 검색
SELECT * FROM tbl_class;

-- 1. 주소가 '경기도'인 학생을 검색하시오
SELECT *
FROM tbl_student
WHERE address LIKE '%경기도%';

-- 2. 주소가 '경기도'이고 남자인 학생을 검색하시오
SELECT *
FROM tbl_student
WHERE address LIKE '%경기도%'
    AND gender = '남자';

-- 3. 나이가 많은 순으로 정렬하시오
SELECT *
FROM tbl_student
ORDER BY age DESC;

-- 4. '박대양'의 나이를 30세로 변경(수정)하시오
UPDATE tbl_student
SET age = 30
WHERE sname = '박대양';




