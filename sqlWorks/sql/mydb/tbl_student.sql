-- �л� ���̺�
CREATE TABLE tbl_student (
    snumber   NUMBER(8) PRIMARY KEY,    -- �л���ȣ(�⺻Ű)
    sname     VARCHAR2(20) NOT NULL,    -- �̸�
    age       NUMBER(3),                -- ����
    gender    VARCHAR2(6) NOT NULL,     -- ����
    address   VARCHAR2(50),             -- �ּ�
    cid       NUMBER(3) NOT NULL,        -- �а��ڵ�
    
    -- �ܷ�Ű ��������(�а�)
    CONSTRAINT fk_class
        FOREIGN KEY(cid)
        REFERENCES tbl_class(cid)
        ON DELETE CASCADE
);

-- �л� �ڷ� ����
INSERT INTO tbl_student
    VALUES (20211234, '�̰�', 22, '����', '����� ���α�', 102);
INSERT INTO tbl_student
    VALUES (20211235, '�ڴ��', 25, '����', '��⵵ ������', 101);
INSERT INTO tbl_student
    VALUES (20211236, '�Ѻ��', 23, '����', '��⵵ ������', 103);
INSERT INTO tbl_student
    VALUES (20211237, 'ȫ�浿', 28, '����', '��⵵ �Ȼ��', 101);
INSERT INTO tbl_student
    VALUES (20211238, '����', 20, '����', '����� �����', 101);
INSERT INTO tbl_student
    VALUES (20211239, '�Ѱ�', 21, '����', '��⵵ ���ν�', 102);

-- �л� ���̺� �˻�
SELECT * FROM tbl_student;