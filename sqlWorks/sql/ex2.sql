-- ��¥ �ڷ���
CREATE TABLE ex2(
    col_date DATE,
    col_timestamp TIMESTAMP
);

-- Ư�� ��¥ ���� �Է� ����
-- hire_date VARCHAR2(20)
-- INSERT INTO ex2 VALUES ('2023-01-25');

-- �ڷ� ����
-- SYSDATE, SYSTIMESTAMP: ���� �ð�
INSERT INTO ex2 VALUES (SYSDATE, SYSTIMESTAMP);
INSERT INTO ex2 VALUES (SYSDATE, SYSTIMESTAMP);

SELECT * FROM ex2;