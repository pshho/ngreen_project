# 컨트롤러 start_app.py
# templates 폴더, static 폴더
# 웹 서버 - flask
import sqlite3

from flask import Flask, render_template, request, \
                  redirect, url_for, session
from sqlite3.dbapi2 import *
from datetime import datetime

app = Flask(__name__)
app.secret_key = 'asd2fa3ewoij@ae#gh?uivas5hdui$1hweaiu6haiwfei@#$^'

# sqlite3 연동 - 객체 생성
def getconn():
    conn = sqlite3.connect("c:/ngreen_project/sqlWorks/sql/pydb/member.db")
    return conn

# url - '/' 경로 설정
@app.route('/', methods=['GET', 'POST'])
def index():
    return render_template('index.html')

# 회원 목록
@app.route('/memberlist', methods=['GET', 'POST'])
def memberlist():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM member"
    cursor.execute(sql)
    rs = cursor.fetchall()
    conn.close()

    return render_template('memberlist.html', rs=rs)

# 회원 가입
@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        # 가입 폼에 입력된 자료를 넘겨받기
        mid = request.form['memberid']
        mpd = request.form['passwd1']
        mnm = request.form['name']
        mgd = request.form['gender']

        # db에 저장
        conn = getconn()
        cursor = conn.cursor()
        sql = f"INSERT INTO member(memberid, passwd, name, gender) " \
              f"VALUES (?, ?, ?, ?)"

        # 자동 로그인 - 세션 발급
        session['userid'] = request.form['memberid']
        cursor.execute(sql, (mid, mpd, mnm, mgd))
        conn.commit()
        conn.close()

        # 회원 가입 후 회원 목록 페이지 이동
        return redirect(url_for('memberlist'))
    else:
        return render_template('register.html')

# 로그인 페이지
@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        # 로그인 폼에 입력된 데이터 넘겨 받기
        mid = request.form['memberid']
        mpd = request.form['passwd1']

        # database에 접속 - 로그인 체크
        conn = getconn()
        cursor = conn.cursor()
        sql = "SELECT * FROM member WHERE memberid = ? AND passwd = ?"
        cursor.execute(sql, (mid, mpd))
        rs = cursor.fetchone()
        conn.close()

        if rs:  # rs = True
            session['userid'] = rs[0]   # memberid를 session 저장

            return redirect(url_for('index'))
        else:
            error_msg = "아이디나 비밀번호를 확인해주세요."

            return render_template('login.html', error_msg=error_msg)
    else:
        return render_template('login.html')

@app.route('/logout', methods=['GET', 'POST'])
def logout():
    session.clear() # 모든 session 삭제

    return redirect(url_for('index'))

# 게시판 페이지
@app.route('/boardlist', methods=['GET', 'POST'])
def boardlist():
    conn = getconn()
    cursor = conn.cursor()
    sql = "SELECT * FROM board ORDER BY bno DESC"
    cursor.execute(sql)
    boardlist = cursor.fetchall()
    conn.close()

    return render_template('boardlist.html', boardlist=boardlist)

# 글작성 페이지
@app.route('/writing', methods=['GET', 'POST'])
def writing():
    if request.method == 'POST':
        # 입력된 글 가져와서 DB에 저장
        title = request.form['title']
        content = request.form['content']
        # userid: session 이름을 가져옴
        memberid = session.get('userid')

        conn = getconn()
        cursor = conn.cursor()
        sql = "INSERT INTO board(title, content, memberid) VALUES (?, ?, ?)"
        cursor.execute(sql, (title, content, memberid))
        conn.commit()
        conn.close()

        return redirect(url_for('boardlist'))

    else:
        return render_template('writing.html')

# 글 상세보기
@app.route('/detail/<int:bno>', methods=['GET', 'POST'])
def detail(bno):    # 매개변수 bno 설정
    # DB board TABLE에서 bno로 검색된 글 가져오기
    conn = getconn()
    cursor = conn.cursor()
    sql = f"SELECT * FROM board WHERE bno = {bno}"
    cursor.execute(sql)
    board = cursor.fetchone()   # 게시글 1개 가져옴

    # 조회수 증가
    hit = board[4]
    sql = f"UPDATE board SET hit = {hit + 1} WHERE bno = {bno}"
    cursor.execute(sql)
    conn.commit()
    conn.close()

    return render_template('detail.html', board=board)

# 게시글 삭제
@app.route('/delete/<int:bno>', methods=['GET', 'POST'])
def delete(bno):
    # 삭제 요청한 글번호를 DB TABLE에서 삭제
    conn = getconn()
    cursor = conn.cursor()
    sql = f"DELETE FROM board WHERE bno = {bno}"    # bno는 숫자이므로 따옴표 붙이지 않음
    cursor.execute(sql)
    conn.commit()
    conn.close()

    return redirect(url_for('boardlist'))

@app.route('/update/<int:bno>', methods=['GET', 'POST'])
def update(bno):
    if request.method == 'POST':
        # 수정 페이지에 수정한 입력 내용을 board 테이블에 저장
        title = request.form['title']
        content = request.form['content']
        now = datetime.today()
        modifydate = now.strftime("%Y-%m-%d %H:%M:%S")

        # DB에 저장
        conn = getconn()
        cursor = conn.cursor()
        sql = "UPDATE board SET title = ?, content = ?, modifydate = ? WHERE bno = ?"
        cursor.execute(sql, (title, content, modifydate, bno))
        conn.commit()
        conn.close()

        return redirect(url_for('detail', bno=bno))
    else:
        # 수정할 글(상세보기)를 DB에서 가져오기
        conn = getconn()
        cursor = conn.cursor()
        sql = f"SELECT * FROM board WHERE bno = {bno}"
        cursor.execute(sql)
        board = cursor.fetchone()
        conn.close()

        return render_template('update.html', board=board)

app.run()