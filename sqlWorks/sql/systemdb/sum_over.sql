SELECT * FROM employee;

-- �μ��� �޿� �Ѿ�
SELECT deptno, SUM(sal)
FROM employee
GROUP BY deptno;

-- �޿� ������ ���
-- SUM(Į����) OVER(ORDER BY Į����)
SELECT  empno,
        ename,
        sal,
        SUM(sal) OVER(ORDER BY empno) "sal_sum", -- �������� ����
        SUM(sal) OVER(ORDER BY empno -- �������� ����(���� ����� ���� ����� ���ϱ�)
            ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) "sal_sum2",
        SUM(sal) OVER(ORDER BY empno -- �������� ����(���� ����� ������ ����� ���ϱ�)
            ROWS BETWEEN CURRENT ROW AND UNBOUNDED FOLLOWING) "sal_sum3"
FROM employee;

-- �μ��� �޿� �Ұ�� �Ѱ�
SELECT deptno, SUM(sal)
FROM employee
GROUP BY ROLLUP(deptno);

-- �μ��� �޿� �Ѿ��� 500���� �̻��� �ڷ� �˻�
SELECT deptno, SUM(sal)
FROM employee
GROUP BY deptno
HAVING SUM(sal) > 5000000;