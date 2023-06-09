-- 집합 연산
CREATE TABLE job(
    job_id  VARCHAR2(10),
    salary  NUMBER(5) -- 달러로 입력
);

INSERT INTO job VALUES('manager', 1300);
INSERT INTO job VALUES('manager', 1500);
INSERT INTO job VALUES('manager', 1900);
INSERT INTO job VALUES('helper', 1000);
INSERT INTO job VALUES('helper', 1500);
INSERT INTO job VALUES('helper', 2500);

SELECT * FROM job;

-- job 전체의 개수와 급여의 총합계 구하기
SELECT COUNT(*) 전체개수, SUM(salary) 총합계
FROM job;

-- 직업 아이디(job_id)별 개수와 급여의 총합계 구하기
SELECT job_id, COUNT(*) 전체개수, SUM(salary) 총합계
FROM job
GROUP BY job_id;

-- 직업 아이디(job_id)별 개수와 급여의 최대값 구하기
SELECT job_id, COUNT(*) 전체개수, MAX(salary) 최대급여
FROM job
GROUP BY job_id;

-- 직업 아이디(job_id)별 개수와 급여의 최소값 구하기
SELECT job_id, COUNT(*) 전체개수, MIN(salary) 최소급여
FROM job
GROUP BY job_id;

-- 직업 아이디(job_id)별 개수와 급여의 최대값과 최소값 구하기
SELECT job_id, COUNT(*) 전체개수, MAX(salary) RESULT
FROM job
GROUP BY job_id
UNION ALL -- ALL은 중복된 것도 다 나옴
SELECT job_id, COUNT(*) 전체개수, MIN(salary)
FROM job
GROUP BY job_id;

COMMIT;

SELECT * FROM job;


