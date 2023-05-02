SELECT * FROM dept;
SELECT * FROM employee;

INSERT INTO employee VALUES(
    107, '이강', 2500000, SYSDATE, '남자', '1001'
);
INSERT INTO employee VALUES(
    108, '이달', 2000000, SYSDATE, '여자', '1001'
);
INSERT INTO employee VALUES(
    109, '한달', 1500000, SYSDATE, '남자', '1002'
);

-- 사원 이름과 급여, 성별, 부서 이름을 검색하시오(JOIN)
SELECT  emp.ename,
        emp.sal,
        emp.gender,
        dep.deptname
FROM dept dep, employee emp
WHERE dep.deptno = emp.deptno;

-- 사원 이름과 급여, 성별, 부서 이름을 검색한 내용을 뷰로 작성
-- CREATE VIEW 뷰이름 AS SELECT * FROM 테이블이름
CREATE VIEW vw_dept_emp AS
SELECT  emp.ename,
        emp.sal,
        emp.gender,
        dep.deptname
FROM dept dep, employee emp
WHERE dep.deptno = emp.deptno;

SELECT *
FROM vw_dept_emp;

-- 모든 사원의 총 인원수를 구하시오
SELECT COUNT(*) 총사원수
FROM vw_dept_emp;

-- 부서별 사원의 총 인원수
SELECT  deptname, 
        COUNT(*) 부서별사원수
FROM vw_dept_emp
GROUP BY deptname;

-- 부서의 인원이 2명을 초과하는 자료를 검색하시오
SELECT  deptname, 
        COUNT(*) 부서별사원수
FROM vw_dept_emp
GROUP BY deptname
HAVING COUNT(*) > 2;

/*
    실행순서
    1. FROM
    2. ON
    3. JOIN
    4. WHERE
    5. GROUP BY
    6. HAVING
    7. SELECT
    8. DISTINCT
    9. ORDER BY
    10. TOP
*/