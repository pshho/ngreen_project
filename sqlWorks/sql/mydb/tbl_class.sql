-- �а� ���̺�
CREATE TABLE tbl_class (
    cid       NUMBER(3) PRIMARY KEY,    -- �а��ڵ�(�⺻Ű)
    cname     VARCHAR2(30) NOT NULL,    -- �а���
    ctel      VARCHAR2(15) NOT NULL,    -- �а���ȭ��ȣ
    clocation VARCHAR2(20) NOT NULL     -- �а��繫����ġ
);

-- �а� �ڷ� ����
INSERT INTO tbl_class
    VALUES (101, '����Ʈ�����а�', '02-1234-1234', 'B�� 3��');
INSERT INTO tbl_class
    VALUES (102, 'ȭ�а��а�', '02-1234-4567', 'B�� 4��');
INSERT INTO tbl_class
    VALUES (103, '�������ڰ��а�', '02-1234-5678', 'B�� 5��');

-- �а� ���̺� �˻�
SELECT * FROM tbl_class;

-- 1. �ּҰ� '��⵵'�� �л��� �˻��Ͻÿ�
SELECT *
FROM tbl_student
WHERE address LIKE '%��⵵%';

-- 2. �ּҰ� '��⵵'�̰� ������ �л��� �˻��Ͻÿ�
SELECT *
FROM tbl_student
WHERE address LIKE '%��⵵%'
    AND gender = '����';

-- 3. ���̰� ���� ������ �����Ͻÿ�
SELECT *
FROM tbl_student
ORDER BY age DESC;

-- 4. '�ڴ��'�� ���̸� 30���� ����(����)�Ͻÿ�
UPDATE tbl_student
SET age = 30
WHERE sname = '�ڴ��';




