-- �μ� ���̺�� ��� ���̺� ����(���� - JOIN)
-- JOIN - 1�� �̻��� ���̺� �����Ͽ� ����ϴ� ���

SELECT * FROM employee;
SELECT * FROM dept;

-- �����ȣ, �����, �μ���ȣ, �μ����� ����Ͻÿ�
SELECT emp.empno, emp.ename, emp.deptno, emp.sal, dep.deptname
FROM employee emp, dept dep
WHERE emp.deptno = dep.deptno;