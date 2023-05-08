-- ROWNUM: ������ ���س��� SUDO COLUMN�̴�.
-- ��ȸ�Ǵ� ���� �� ���� ����
SELECT ROWNUM, bno, title, writer, content
FROM board
-- 1�� �����ؾ� ��ȸ��
WHERE ROWNUM > 0 and ROWNUM <= 10
ORDER BY bno;

-- 11�� ~ 20������ �˻�(��ø���� �� �˻� ����)
SELECT *
FROM (SELECT ROWNUM RN, bno, title, writer, content
        FROM board)
WHERE RN > 20 and RN <= 30; -- ��Ī�� ����ؾ� ��

-- ROWNUM ���ø� ���� ���̺� ����
CREATE TABLE EX_SCORE (
    NAME    VARCHAR2(10),
    SCORE   NUMBER
);

INSERT INTO EX_SCORE VALUES ('���ϳ�', 94);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 100);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 97);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 87);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 87);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 91);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 66);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 80);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 80);
INSERT INTO EX_SCORE VALUES ('���ϳ�', 95);

SELECT * FROM EX_SCORE;

-- ������ ���� ������ 5�� �˻�(�߸��� �˻�)
SELECT ROWNUM, NAME, SCORE
FROM EX_SCORE
WHERE ROWNUM <= 5
ORDER BY SCORE DESC;

-- ROWNUM �ùٸ� ���(���� ���� ��� - �ζ��� ��)
SELECT ROWNUM, NAME, SCORE
FROM (SELECT ROWNUM, NAME, SCORE
      FROM EX_SCORE
      ORDER BY SCORE DESC)
WHERE ROWNUM <= 5;

-- ���� ����
SELECT  NAME,
        SCORE,
        RANK () OVER (ORDER BY SCORE DESC) RANK,
        DENSE_RANK () OVER (ORDER BY SCORE DESC) DENSE_RANK
     -- COUNT(*) �л���
FROM EX_SCORE;

DROP TABLE EX_SCORE;
