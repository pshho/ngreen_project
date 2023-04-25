-- 학생 테이블
CREATE TABLE tbl_student (
    snumber   NUMBER(8) PRIMARY KEY,    -- 학생번호(기본키)
    sname     VARCHAR2(20) NOT NULL,    -- 이름
    age       NUMBER(3),                -- 나이
    gender    VARCHAR2(6) NOT NULL,     -- 성별
    address   VARCHAR2(50),             -- 주소
    cid       NUMBER(3) NOT NULL,        -- 학과코드
    
    -- 외래키 제약조건(학과)
    CONSTRAINT fk_class
        FOREIGN KEY(cid)
        REFERENCES tbl_class(cid)
        ON DELETE CASCADE
);

-- 학생 자료 삽입
INSERT INTO tbl_student
    VALUES (20211234, '이강', 22, '여자', '서울시 종로구', 102);
INSERT INTO tbl_student
    VALUES (20211235, '박대양', 25, '남자', '경기도 성남시', 101);
INSERT INTO tbl_student
    VALUES (20211236, '한비야', 23, '여자', '경기도 수원시', 103);
INSERT INTO tbl_student
    VALUES (20211237, '홍길동', 28, '여자', '경기도 안산시', 101);
INSERT INTO tbl_student
    VALUES (20211238, '강남', 20, '남자', '서울시 노원구', 101);
INSERT INTO tbl_student
    VALUES (20211239, '한강', 21, '여자', '경기도 용인시', 102);

-- 학생 테이블 검색
SELECT * FROM tbl_student;