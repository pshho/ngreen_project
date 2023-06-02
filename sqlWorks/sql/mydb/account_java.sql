-- 은행 계정 테이블 생성
CREATE TABLE account(
    ano     VARCHAR2(15) PRIMARY KEY,
    owner   VARCHAR2(20) NOT NULL,
    balance NUMBER(20)   NOT NULL
);

INSERT INTO account VALUES('2655837234', '박성호', 100000);

DELETE FROM account WHERE account.owner = '그린컴퓨터';

COMMIT;

SELECT * FROM account;
    