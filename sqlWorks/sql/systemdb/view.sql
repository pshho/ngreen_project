SELECT * FROM dept;
SELECT * FROM employee;

INSERT INTO employee VALUES(
    107, '�̰�', 2500000, SYSDATE, '����', '1001'
);
INSERT INTO employee VALUES(
    108, '�̴�', 2000000, SYSDATE, '����', '1001'
);
INSERT INTO employee VALUES(
    109, '�Ѵ�', 1500000, SYSDATE, '����', '1002'
);

-- ��� �̸��� �޿�, ����, �μ� �̸��� �˻��Ͻÿ�(JOIN)
SELECT  emp.ename,
        emp.sal,
        emp.gender,
        dep.deptname
FROM dept dep, employee emp
WHERE dep.deptno = emp.deptno;

-- ��� �̸��� �޿�, ����, �μ� �̸��� �˻��� ������ ��� �ۼ�
-- CREATE VIEW ���̸� AS SELECT * FROM ���̺��̸�
CREATE VIEW vw_dept_emp AS
SELECT  emp.ename,
        emp.sal,
        emp.gender,
        dep.deptname
FROM dept dep, employee emp
WHERE dep.deptno = emp.deptno;

SELECT *
FROM vw_dept_emp;

-- ��� ����� �� �ο����� ���Ͻÿ�
SELECT COUNT(*) �ѻ����
FROM vw_dept_emp;

-- �μ��� ����� �� �ο���
SELECT  deptname, 
        COUNT(*) �μ��������
FROM vw_dept_emp
GROUP BY deptname;

-- �μ��� �ο��� 2���� �ʰ��ϴ� �ڷḦ �˻��Ͻÿ�
SELECT  deptname, 
        COUNT(*) �μ��������
FROM vw_dept_emp
GROUP BY deptname
HAVING COUNT(*) > 2;

/*
    �������
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