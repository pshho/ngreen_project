from sqlite3.dbapi2 import *
import sqlite3

# member table과 연동
'''
def getconn():
    conn = sqlite3.connect("c:/ngreen_project/sqlWorks/sql/pydb/member.db")
    return conn

# print(getconn(), "연결 객체 생성됨")

def select():
    cursor = getconn().cursor()
    sql = "SELECT * FROM member"
    cursor.execute(sql)
    rs = cursor.fetchall()  # 검색 수행

    print(rs)

    for i in rs:
        print(i)

    getconn().close()

select()

def insert():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "INSERT INTO member(memberid, passwd, name, gender) " \
          "VALUES (?, ?, ?, ?)"
    cursor.execute(sql, ('today123', 'm123456$', '투데이', '여'))
    conn.commit()
    conn.close()

# insert()

def select_one():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩
    sql = "SELECT * FROM member WHERE memberid = ? AND passwd = ?"
    cursor.execute(sql, ('cloud123', 'm123456#'))
    rs = cursor.fetchone()

    print(rs)

    conn.close()

select_one()
'''

# board table과 연동
def getconn():
    conn = sqlite3.connect("c:/ngreen_project/sqlWorks/sql/pydb/member.db")
    return conn

# board table 생성
def create_board():
    conn = getconn()
    cursor = conn.cursor()
    sql = '''
        CREATE TABLE board(
            bno         INTEGER PRIMARY KEY AUTOINCREMENT,
            title       TEXT NOT NULL,
            content     TEXT NOT NULL,
            createdate  DATETIME DEFAULT (datetime('now', 'localtime')),
            hit         INTEGER DEFAULT 0,
            memberid    TEXT NOT NULL,
            FOREIGN KEY(memberid) REFERENCES member(memberid) ON DELETE CASCADE
        )
        '''
    cursor.execute(sql)
    conn.commit()
    conn.close()

# 함수 호출
# create_board()

def insert_board():
    conn = getconn()
    cursor = conn.cursor()
    sql = "INSERT INTO board(title, content, memberid) VALUES (?, ?, ?)"
    cursor.execute(sql, ('가입인사', '안녕하세요! 홍길동입니다.', 'cloud123'))
    conn.commit()
    conn.close()

# insert_board()

def drop_board():
    conn = getconn()
    cursor = conn.cursor()
    sql = "DROP TABLE board"
    cursor.execute(sql)
    conn.commit()
    conn.close()

# drop_board()

def select_board():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM board"
    cursor.execute(sql)
    boardlist = cursor.fetchall()

    print(boardlist)

    for board in boardlist:
        print(board)

    conn.close()

select_board()