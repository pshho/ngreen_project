-- ���� ���� ���̺� ����
CREATE TABLE account(
    ano     VARCHAR2(15) PRIMARY KEY,
    owner   VARCHAR2(20) NOT NULL,
    balance NUMBER(20)   NOT NULL
);

INSERT INTO account VALUES('2655837234', '�ڼ�ȣ', 100000);

DELETE FROM account WHERE account.owner = '�׸���ǻ��';

COMMIT;

SELECT * FROM account;
    