from sqlite3.dbapi2 import *
import sqlite3

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

# select()

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