-- 게시판 테이블
CREATE TABLE boards(
    bid         NUMBER(4) PRIMARY KEY,
    title       VARCHAR2(100) NOT NULL,
    contents    VARCHAR2(2000) NOT NULL,
    regdate     TIMESTAMP DEFAULT SYSTIMESTAMP,
    modifydate  TIMESTAMP,
    hit         NUMBER DEFAULT 0,
    memberid    VARCHAR2(20),
    CONSTRAINT fk_member_board FOREIGN KEY (memberid)
    REFERENCES members(memberid)
);

-- 게시글 번호 시퀀스 생성
CREATE SEQUENCE b_seq;
ALTER SEQUENCE b_seq 
NOCACHE;
DROP SEQUENCE b_seq;

-- 게시글 등록
INSERT INTO boards(bid, title, contents, memberid)
VALUES(b_seq.NEXTVAL, '공지사항', '글 내용', 'today');

-- 게시글 목록 조회
SELECT * FROM boards;

DELETE FROM boards WHERE bid = 3;