-- bookmall
SELECT * FROM book;
SELECT * FROM customer;
SELECT * FROM orders;

-- JOIN(�������� - EQUI JOIN) - ����� �κ�(������(AND))
-- �� �̸��� ���� �ֹ� ������ �ǸŰ����� ���Ͻÿ�
SELECT cus.name, ord.sale00000000000000price, ord.orderdate
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
ORDER BY cus.name;

-- '������' ���� �ֹ��� ������ �ǸŰ����� ���Ͻÿ�
SELECT cus.name, ord.saleprice, ord.orderdate
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
    AND cus.name = '������';

-- '������' ���� �ֹ��� ������ �ǸŰ��ݰ� ���������� ���Ͻÿ�(3���� ���̺� JOIN)
SELECT cus.name, bk.bookname, ord.saleprice, ord.orderdate
FROM customer cus, orders ord, book bk
WHERE cus.custid = ord.custid
    AND bk.bookid = ord.bookid
    AND cus.name = '������';

-- JOIN(�ܺ� ���� - '+' ������ ���): JOIN ���ǿ� �����ϴ� ������ �ܿ��� �˻��ϴ� ���
-- WHERE ������ ��� ���� ��µǴ� ���̺��� �ݴ��� ���̺� '+'�� ����
-- �ֹ��� ���� ���� �����Ͽ� ���� �̸��� �ֹ��� ������ �ǸŰ����� ã���ÿ�
SELECT cus.name, ord.saleprice
FROM customer cus, orders ord
WHERE cus.custid = ord.custid(+)
ORDER BY cus.name;

-- ������ �ֹ��� ��� ������ �� �Ǹűݾ��� ���Ͻÿ�(GROUP BY��, SUM()�Լ�)
SELECT cus.name, SUM(ord.saleprice) �Ǹž�
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
GROUP BY cus.name;

-- '�Ȼ�' ���� �ֹ��� ��� ������ �� �Ǹűݾ��� ���Ͻÿ�(GROUP BY��, SUM()�Լ�)
SELECT cus.name, SUM(ord.saleprice) �Ǹž�
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
GROUP BY cus.name
    HAVING cus.name = '�Ȼ�';

-- ǥ�� SQL �� INNER JOIN ~ ON
SELECT cus.name, ord.saleprice, ord.orderdate
FROM customer cus
    INNER JOIN orders ord
    ON cus.custid = ord.custid
ORDER BY cus.name;

-- '������' ���� �ֹ��� ������ �ǸŰ����� ���Ͻÿ�
SELECT cus.name, ord.saleprice, ord.orderdate
FROM customer cus
    INNER JOIN orders ord
    ON cus.custid = ord.custid
WHERE cus.name = '������';

-- ǥ�� SQL - LEFT OUTER JOIN ~ ON
-- OUTER JOIN(�ܺ� ����): JOIN ���ǿ� �����ϴ� ������ �ܿ��� �˻��ϴ� ���
-- �ֹ��� ���� ���� �����Ͽ� ���� �̸��� �ֹ��� ������ �ǸŰ����� ã���ÿ�
SELECT cus.name, ord.saleprice
FROM customer cus
    FULL OUTER JOIN orders ord
    ON cus.custid = ord.custid
ORDER BY cus.name;









