-- function
-- NULL�� ó���ϱ�
SELECT *
FROM customer
WHERE phone IS NULL;

-- NVL(Į����, Ư����): Į������ NULL�̸� Ư���� ���, NULL�� �ƴϸ� Į���� ���
SELECT  custid,
        name,
        address,
        NVL(phone, '010-1234-5678') phone
FROM customer;

CREATE TABLE k1 (
    ID VARCHAR2(3),
    CNT NUMBER(2)
);

INSERT INTO k1 VALUES ('��', 5);
INSERT INTO k1 VALUES ('��', NULL);
INSERT INTO k1 VALUES ('��', 5);
INSERT INTO k1 VALUES ('��', NULL);
INSERT INTO k1 VALUES ('��', 10);

SELECT * FROM k1;

-- ��ü ����, �հ�, ���, �ּҰ�
-- NULL���� 0���� �ٲ�, COUNT�� NULL�� ����X
SELECT COUNT(NVL(CNT, 0)) COUNT -- 5
FROM k1;

SELECT SUM(NVL(CNT, 0))/4 SUM   -- 5
FROM k1;

SELECT AVG(NVL(CNT, 0)) AVG     -- 4
FROM k1;

-- NULL���� 5��
SELECT MIN(NVL(CNT, 5)) MIN     -- 5
FROM k1;

-- RANK() �Լ�
SELECT  ename,
        sal,
        RANK() OVER(ORDER BY sal DESC) �޿�_RANK,
        DENSE_RANK() OVER(ORDER BY sal DESC) �޿�_DENSE_RANK
FROM employee;



