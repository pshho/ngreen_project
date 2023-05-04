# 컨트롤러 start_app.py
# templates 폴더, static 폴더
# 웹 서버 - flask
import sqlite3

from flask import Flask, render_template, request, \
                  redirect, url_for, session
from sqlite3.dbapi2 import *

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

app.run()