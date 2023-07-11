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
ALTER SEQUENCE b_seq NOCACHE;
-- DROP SEQUENCE b_seq;

-- 시퀀스 번호 변경
ALTER SEQUENCE b_seq INCREMENT BY 1;

-- 게시판 테이블 파일 업로드 항목 추가
ALTER TABLE boards ADD fileuploads VARCHAR2(50);

-- 게시글 등록
INSERT INTO boards(bid, title, contents, memberid)
VALUES(b_seq.NEXTVAL, '공지사항', '글 내용', 'today');

-- 게시글 목록 조회
SELECT * FROM boards;

DELETE FROM boards WHERE bid = 3;

-- 게시글 수정
UPDATE boards SET hit = 0 WHERE bid = 4;

-- 기존 외래키 제약 조건 삭제
ALTER TABLE boards DROP CONSTRAINT fk_member_board;

-- 새로운 외래키 제약 조건 추가(ON DELETE CASCADE 추가)
ALTER TABLE boards ADD CONSTRAINT fk_member_board
    FOREIGN KEY (memberid)
    REFERENCES members(memberid)
    ON DELETE CASCADE;
    
-- id 중복 체크
SELECT DECODE(COUNT(*), 1, 'true', 'false') as result
FROM members WHERE memberid = 'today';

-- decode뺀 id 중복 체크
SELECT COUNT(*) as result
FROM members WHERE memberid = 'today';

-- 페이지 처리
SELECT *
FROM (SELECT ROWNUM rn, board.*
        FROM (SELECT * FROM boards order by bid desc) board)
WHERE rn >= 1 AND rn <= 10;

ORDER BY rn DESC; -- 별칭(RN) 사용해야 가능




