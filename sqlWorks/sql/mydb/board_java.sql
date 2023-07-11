-- �Խ��� ���̺�
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

-- �Խñ� ��ȣ ������ ����
CREATE SEQUENCE b_seq;
ALTER SEQUENCE b_seq NOCACHE;
-- DROP SEQUENCE b_seq;

-- ������ ��ȣ ����
ALTER SEQUENCE b_seq INCREMENT BY 1;

-- �Խ��� ���̺� ���� ���ε� �׸� �߰�
ALTER TABLE boards ADD fileuploads VARCHAR2(50);

-- �Խñ� ���
INSERT INTO boards(bid, title, contents, memberid)
VALUES(b_seq.NEXTVAL, '��������', '�� ����', 'today');

-- �Խñ� ��� ��ȸ
SELECT * FROM boards;

DELETE FROM boards WHERE bid = 3;

-- �Խñ� ����
UPDATE boards SET hit = 0 WHERE bid = 4;

-- ���� �ܷ�Ű ���� ���� ����
ALTER TABLE boards DROP CONSTRAINT fk_member_board;

-- ���ο� �ܷ�Ű ���� ���� �߰�(ON DELETE CASCADE �߰�)
ALTER TABLE boards ADD CONSTRAINT fk_member_board
    FOREIGN KEY (memberid)
    REFERENCES members(memberid)
    ON DELETE CASCADE;
    
-- id �ߺ� üũ
SELECT DECODE(COUNT(*), 1, 'true', 'false') as result
FROM members WHERE memberid = 'today';

-- decode�� id �ߺ� üũ
SELECT COUNT(*) as result
FROM members WHERE memberid = 'today';

-- ������ ó��
SELECT *
FROM (SELECT ROWNUM rn, board.*
        FROM (SELECT * FROM boards order by bid desc) board)
WHERE rn >= 1 AND rn <= 10;

ORDER BY rn DESC; -- ��Ī(RN) ����ؾ� ����




