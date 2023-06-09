--  회원 테이블
CREATE TABLE members(
    memberid    VARCHAR2(20) PRIMARY KEY,
    passwd      VARCHAR2(20) NOT NULL,
    name        VARCHAR2(30) NOT NULL,
    gender      VARCHAR2(10),
    joindate    DATE DEFAULT SYSDATE
);

INSERT INTO members(memberid, passwd, name, gender)
VALUES('today', 'today1234', '길동', '남자');

UPDATE members SET gender = '남'
WHERE memberid = 'today';

SELECT * FROM members;