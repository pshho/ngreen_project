SELECT * FROM book;

-- bookid�� 11���� ���� ����
DELETE FROM book
WHERE bookid = 11;

-- ���� ����(���� ��ø)
-- å�� �Ѽ����� ���Ͻÿ�
SELECT COUNT(*) å���Ѽ��� FROM book;

-- ���� �� ���� ���� ������ ã���ÿ�
SELECT MAX(price) �ְ��� FROM book;

-- ���� ��� ������ �̸��� �˻��Ͻÿ�
SELECT bookname, price
FROM book
WHERE price = (SELECT MAX(price) �ְ��� FROM book);

-- ���� ���� �ֹ��� ���� �����͸� ��� �˻��Ͻÿ�
SELECT * FROM customer;
SELECT * FROM orders;

SELECT *
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;

-- ���� �ֹ������� �˻��Ͻÿ�
SELECT cus.name, SUM(ord.saleprice)
FROM customer cus, orders ord
WHERE cus.custid = ord.custid
GROUP BY cus.name
HAVING cus.name = '�迬��';