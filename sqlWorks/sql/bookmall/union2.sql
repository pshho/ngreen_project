-- 대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름 검색
-- UNION 사용
-- 대한민국에 거주하는 고객의 이름
SELECT name
FROM customer
WHERE address LIKE '%대한민국%';

-- 도서를 주문한 고객의 이름 검색
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;

-- 집합연산(더하기 - 합집합)
SELECT name
FROM customer
WHERE address LIKE '%대한민국%'
UNION
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;

-- UNION ALL - 중복허용
SELECT name
FROM customer
WHERE address LIKE '%대한민국%'
UNION ALL
SELECT cus.name
FROM customer cus, orders ord
WHERE cus.custid = ord.custid;