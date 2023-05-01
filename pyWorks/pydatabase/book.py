import sqlite3
def getconn():
    conn = sqlite3.connect("c:/ngreen_project/sqlWorks/sql/pydb/textdb.db")
    return conn

# print(getconn(), "연결 객체 생성")

# 테이블 생성
def create():
    conn = getconn()
    cursor = conn.cursor()  # cursor() 객체 sql 조작
    sql = """
            CREATE TABLE book (
                book_no   INTEGER PRIMARY KEY AUTOINCREMENT,
                title     TEXT NOT NULL,
                author    TEXT NOT NULL,
                page      INTEGER
            )
          """
    cursor.execute(sql) # 작업 실행
    conn.commit()   # 커밋
    conn.close()

# create()

# 데이터 추가
def insert():
    conn = getconn()
    cursor = conn.cursor()
    sql = "INSERT INTO book(title, author, page) " \
          "VALUES (?, ?, ?)"
    # cursor.execute(sql, ('혼자 공부하는 자바', '신용권', 600))
    cursor.execute(sql, ('python projects', '켄 유엔스', 500))
    conn.commit()
    conn.close()

# insert()

# 테이블 전체 검색
def select():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM book"
    cursor.execute(sql)
    rs = cursor.fetchall()

    print(rs)   # 리스트로 출력

    for i in rs:    # 튜플로 출력
        print(i)

    conn.close()

select()

# 테이블 한 개 검색
def select_one():
    conn = getconn()
    cursor = conn.cursor()
    # 동적 바인딩 방식
    sql = "SELECT * FROM book " \
          "WHERE book_no = ?"
    cursor.execute(sql, (2, ))  # 튜플 자료구조이므로 1개 사용(쉼표 사용)
    rs = cursor.fetchone()

    print(rs)   # 리스트로 출력

    conn.close()

# select_one()

# 데이터 수정
def update():
    conn = getconn()
    cursor = conn.cursor()
    # book_no가 2번인 page를 650page로 변경하기
    sql = "UPDATE book SET page = ? WHERE book_no = ?"
    cursor.execute(sql, (650, 2))
    conn.commit()
    conn.close()

# update()

# 데이터 삭제
def delete():
    conn = getconn()
    cursor = conn.cursor()
    # book_no가 1번인 책 삭제
    sql = "DELETE FROM book WHERE book_no = ?"
    cursor.execute(sql, (1, ))
    conn.commit()
    conn.close()

# delete()