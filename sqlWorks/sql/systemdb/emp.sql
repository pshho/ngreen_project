-- ��� ���̺�
CREATE TABLE emp(
    -- Į���̸� �ڷ���
    empno   NUMBER(3) PRIMARY KEY,   -- �����ȣ
    ename   VARCHAR2(20) NOT NULL,   -- ����̸�
    sal     NUMBER(10),              -- ����޿�
    createdate DATE DEFAULT SYSDATE  -- �����
);

-- ����� ����Į���� �߰�(ALTER TABLE ���̺��̸� ~ ADD Į���̸� �ڷ���)
ALTER TABLE emp ADD gender VARCHAR2(4);

-- ����� ���� �ڷ����� ����(MODIFY)
ALTER TABLE emp MODIFY gender VARCHAR2(10);

DESC emp;

-- ����߰�
INSERT INTO emp VALUES(100, '�̰�', 2500000, SYSDATE);
INSERT INTO emp VALUES(101, '���', 3000000, SYSDATE);
INSERT INTO emp VALUES(102, '�����', 5000000, SYSDATE);
INSERT INTO emp VALUES(103, '�ڽ���', '', SYSDATE);
INSERT INTO emp VALUES(104, '�����', 1500000, SYSDATE, '��');

-- �����ȸ
SELECT * FROM emp;

-- �����ȣ, �̸�, �޿��� �˻��Ͻÿ�
SELECT empno as ���, ename as �����, sal as �޿� FROM emp;

-- �޿��� ���� ����� �˻��Ͻÿ�
SELECT *
FROM emp
WHERE sal IS NULL; -- null�� �ƴ� ����(IS NOT NULL)

-- �޿��� 300���� ������ ����� �޿��� ���� ������ �����Ͻÿ�
SELECT *
FROM emp
WHERE sal <= 3000000
ORDER BY sal DESC;

-- �޿��� ���� ������ �����Ͻÿ�
SELECT *
FROM emp
ORDER BY sal DESC;

-- �̸��� ������� ����� �˻��Ͻÿ�
/* SELECT * FROM emp
WHERE empno = 104; */

-- ������ '��'�� ����� '����'�� ����
UPDATE emp
SET gender = '����'
WHERE empno = 104;

-- ����� ���� ���Ͻÿ�
SELECT COUNT(*) as �����
FROM emp;

-- ��� �޿��� �հ�� ����� ���Ͻÿ�
SELECT SUM(sal) �޿��հ�, AVG(sal) �޿����
FROM emp;

-- ��� �̸��� ������� ��� ����
DELETE FROM emp
WHERE ename = '�����';

-- COMMIT ���̸� ��������
COMMIT;

ROLLBACK;