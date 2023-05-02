-- ��Ƽ������: SQL ����ȭ �۾�

SELECT * FROM board;

-- �ۼ��ڰ� '������(admin)'�� �Խñ� ��ȸ
SELECT *
FROM board
WHERE writer = 'admin';

-- �ۼ��ڰ� '������(admin)'�� �Խñ� ��ȸ - �ε����� �����
-- CREATE INDEX �ε����̸� ON ���̺��̸�(Į���̸�)
CREATE INDEX idx_writer ON board(writer);

-- ����Ŭ ��Ʈ
-- /*+ INDEX (���̺� �̸� �ε����̸�) */
SELECT /*+ INDEX(board idx_writer) */ *
FROM board
WHERE writer = 'admin';

-- ���� ��ȹ ���� �ڵ�
SELECT *
FROM TABLE (
        DBMS_XPLAN.DISPLAY_CURSOR(null, null, 'ALLSTATS LAST')
     );


-- �ε��� ����
DROP INDEX idx_admin;