-- ���ѹα��� �����ϴ� ���� �̸��� ������ �ֹ��� ���� �̸� �˻�
-- UNION ���
-- ���ѹα��� �����ϴ� ���� �̸�
SELECT name
FROM customer
WHERE address LIKE '%���ѹα�%';

-- ������ �ֹ��� ���� �̸� �˻�
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;

-- ���տ���(���ϱ� - ������)
SELECT name
FROM customer
WHERE address LIKE '%���ѹα�%'
UNION
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;

-- UNION ALL - �ߺ����
SELECT name
FROM customer
WHERE address LIKE '%���ѹα�%'
UNION ALL
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;