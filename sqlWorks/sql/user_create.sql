SHOW USER;

-- ����� ���� �����
-- DB�̸�, ��й�ȣ, ���̺� ���� ����(SYSTEM����)
CREATE USER C##mydb2 IDENTIFIED BY mydb
    DEFAULT TABLESPACE USERS
    TEMPORARY TABLESPACE TEMP;

-- ���� ����
GRANT CONNECT, DBA TO C##mydb2;
GRANT CREATE SESSION TO C##mydb2;

SELECT * FROM DBA_ROLES;






