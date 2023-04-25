-- ���� Ÿ�� �Լ�
-- ������ ���̺�: dual'
-- ���밪: ABS(��)
SELECT ABS(-10)
FROM dual;

-- �ݿø�: ROUND(��, �ڸ���)
SELECT ROUND(3.875, 2)
FROM dual;

-- ����: TRUNC(��, �ڸ���)
SELECT TRUNC(3.875, 1)
FROM dual;

SELECT * FROM employee;

-- sal�� 30�Ϸ� ���� �� �Ҽ� �ڸ����� ���� �ݿø�
SELECT sal �޿�,
       sal/30 �ϱ�,
       ROUND(sal/30, 1) ���1,
       ROUND(sal/30, 0) ���2,
       ROUND(sal/30, -1) ���3
FROM employee;

-- sal�� 30�Ϸ� ���� �� �Ҽ� �ڸ����� ���� ����(����)
SELECT sal �޿�,
       sal/30 �ϱ�,
       TRUNC(sal/30, 1) ���1,
       TRUNC(sal/30, 0) ���2,
       TRUNC(sal/30, -1) ���3
FROM employee;

-- ���� ��� �ֹ� �ݾ��� ��� ������ �ݿø��� ���� ���Ͻÿ�
SELECT custid ����ȣ,
       ROUND(AVG(saleprice), -2) ����ֹ��ݾ�,
       COUNT(*) �ֹ���,
       SUM(saleprice) �Ѿ�    
FROM orders
GROUP BY custid;

SELECT  SUM(saleprice) ���Ǹűݾ�,
        ROUND(AVG(saleprice), -2) ������ֹ��ݾ�
FROM orders;

SELECT custid ����ȣ,
       ROUND(SUM(saleprice)/COUNT(*), -2) ��ձݾ�
FROM orders
GROUP BY custid;

-- ���� Ÿ�� �Լ�
SELECT LOWER('ABCD') RESULT
FROM dual;

-- SUBSTR(����, �ε���, ���ڼ�)
SELECT SUBSTR('ABC', 1, 2) RESULT
FROM dual;

-- REPLACE(����, ���� ����, ���ο� ����)
SELECT REPLACE('ABC', 'A', 'E') RESULT
FROM dual;

-- CONCAT(����1, ����2) - ���� ����
SELECT CONCAT('A', 'B') RESULT
FROM dual;
-- ���Ῥ���� - '||'�� CONCAT ����
SELECT '�ȳ�' || '�ϼ���' RESULT
FROM dual;

-- LPAD(����, ���ڼ�, �߰��� ����(��ȣ)) - �߰��� ���ڸ� ���ʺ��� ä��
-- RPAD - �����ʺ��� ä��
SELECT LPAD('cloud', 10, '*') RESULT
FROM dual;
SELECT RPAD('cloud', 10, '*') RESULT
FROM dual;

-- �μ��̸����� ó������ �����ؼ� 2���� ���� ���
SELECT SUBSTR(deptname, 1, 2) �μ���
FROM dept;

-- ���� ���� �߱��� ���Ե� ������ �󱸷� �����Ͽ� �˻�
SELECT bookid,
       REPLACE(bookname, '�߱�', '��') å����
FROM book
WHERE bookname LIKE '%�߱�%';

-- �½��������� ������ ������ ����� ������ ���� ��, ����Ʈ ���� �˻�
-- �ѱ��� - 3byte/����, Ư����ȣ, ���� - 1byte
SELECT bookname ��������,
       LENGTH(bookname) ���ڼ�,
       LENGTHB(bookname) ����Ʈ��
FROM book
WHERE publisher = '�½�����';

-- ��¥�Լ�
-- ���� ��¥�� 20����
SELECT SYSDATE - 20 FROM dual;

-- 4�� 1�Ͽ��� 10�� ��(������(Ư���� ��) �� ��¥��)
SELECT TO_DATE('2023/04/01') + 20 FROM dual;

-- �Ի���(2022-01-01), �����(2023-01-31): �������
SELECT
    ROUND (MONTHS_BETWEEN
          (TO_DATE('2023-01-31'),
           TO_DATE('2022-01-01'))) �Ѱ�����
FROM dual;

-- ���� ��¥�� �ð�
SELECT SYSTIMESTAMP FROM dual;

-- 3���� �� ��¥
SELECT ADD_MONTHS(SYSDATE, 3) ���
FROM dual;
-- 3���� �� ��¥
SELECT ADD_MONTHS(SYSDATE, -3) ���
FROM dual;
-- 3���� �� Ư�� ��¥
SELECT ADD_MONTHS('2023:4:1', -3) ���
FROM dual;

-- �ֹ���ȣ�� 6���� 10������ ������ �ֹ��Ͽ� 3���� ���Ѱ��� ���Ͻÿ�
-- 1. �ֹ���ȣ�� 6~10�� ���� �˻�
SELECT  orderid �ֹ���ȣ,
        ADD_MONTHS(orderdate, 3) ���ϱ���,
        ADD_MONTHS(orderdate, -3) ������
FROM orders
WHERE orderid BETWEEN 6 AND 10;

SELECT  orderid �ֹ���ȣ,
        ADD_MONTHS(orderdate, 3) ���ϱ���,
        ADD_MONTHS(orderdate, -3) ������
FROM orders
WHERE orderid >= 6 AND orderid <= 10;

-- �ֹ���ȣ�� 10�� ������ �ֹ��Ϸκ��� ���ñ��� �Ѱ������� ���Ͻÿ�
-- MONTHS_BETWEEN(���ĳ�¥, ������¥)
SELECT  orderid �ֹ���ȣ,
        orderdate �ֹ���,
        TRUNC(MONTHS_BETWEEN(SYSDATE, orderdate), 0) �Ѱ�����
FROM orders
WHERE orderid = 10;

-- ������ �ֹ��Ϸκ��� 10�� �� ������ Ȯ���Ѵ�. �� �ֹ��� Ȯ�����ڸ� ���Ͻÿ�.
SELECT  orderid �ֹ���ȣ,
        orderdate �ֹ���,
        orderdate + 10 �ֹ�Ȯ����
FROM orders;

-- �ڵ� Ÿ�� ��ȯ
SELECT 1 + '2' FROM dual;

-- ���� Ÿ�� ��ȯ
-- ���ڸ� ���� �������� ��ȯ
SELECT TO_NUMBER('120') ���
FROM dual;

-- ��¥ ����
SELECT TO_DATE('2022-06-30', 'YY-MM-DD') ���
FROM dual;

-- ��¥ ���� ��ȯ
SELECT  TO_CHAR(SYSDATE, 'YY-MM-DD') ��¥,
        TO_CHAR(SYSDATE, 'YYYY') ����,
        TO_CHAR(SYSDATE, 'MM') ��,
        TO_CHAR(SYSDATE, 'DD') ��
FROM dual;

-- �ð� ���� ��ȯ
SELECT  TO_CHAR(SYSDATE, 'HH:MI:SS AM') �ð�����,
        TO_CHAR(SYSDATE, 'YYYY/MM/DD HH:MI:SS PM') ��¥�ͽð�
FROM dual;

-- ������ ���� ���� ���� ����� �ο����� ���Ͻÿ�
-- ��Ʈ, GROUP BY��, SUBSTR(), COUNT(*)
SELECT  SUBSTR(name, 1, 1) ��,
        COUNT(*) ���ο���
FROM customer
GROUP BY SUBSTR(name, 1, 1);

