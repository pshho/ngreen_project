import sqlite3

def getcon():
    # 연결 객체 생성
    conn = sqlite3.connect("c:/ngreen_project/pyWorks/pydb/mydb.db")
    # print(conn)

    return conn

def select():
    conn = getcon()

    # cursor 변수 생성
    cursor = conn.cursor()   # cursor 모든 조작(삽입, 검색, 수정, 삭제)을 수행하는 함수(DML)
    sql = "SELECT * FROM employee"
    cursor.execute(sql)

    # 검색 - fetchall(): 전체 검색, fetchone(): 상세 검색
    rs = cursor.fetchall()  # 자료 구조가 리스트, 개별 요소는 튜플
    # print(rs)

    for i in rs:
        print(i)

    conn.close()

def insert():
    conn = getcon()
    cursor = conn.cursor()
    sql = "INSERT INTO employee VALUES ('e103', '안산', 22, 10000)"
    cursor.execute(sql)
    conn.commit()   # 삽입, 수정, 삭제 시 반드시 커밋
    conn.close()

def update():
    conn = getcon()
    cursor = conn.cursor()
    sql = "UPDATE employee SET age = 40 WHERE name = '추신수'"
    cursor.execute(sql)
    conn.commit()   # 삽입, 수정, 삭제 시 반드시 커밋
    conn.close()

def delete():
    conn = getcon()
    cursor = conn.cursor()
    # 사원 번호가 'e102'인 사원 삭제
    sql = "DELETE FROM employee WHERE empid = 'e102'"
    cursor.execute(sql)
    conn.commit()   # 삽입, 수정, 삭제 시 반드시 커밋
    conn.close()

def select1():
    conn = getcon()
    cursor = conn.cursor()
    sql = "SELECT * FROM employee WHERE empid = 'e103'"
    cursor.execute(sql)
    rs = cursor.fetchone()

    print(rs)

    conn.close()

# 메인 영역에서 호출에서 사용
# insert()
# update()
# delete()
select()
# select1()