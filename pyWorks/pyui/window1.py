# GUI(Graphic User Interface) 프로그램 만들기
# CUI(Character User Interface) - 명령 프롬프트, console(콘솔)
import tkinter  # 모듈 tkinter.py
from tkinter import *

root = Tk()
root.title("처음 만드는 윈도우")
root.geometry("300x200+300+100")    # width X height: 300 X 200, '+' - 왼쪽에서 x좌표, '+' - 위에서 y좌표: + 300 + 100

# 버튼 생성
# grid(), pack() - 레이아웃
btn = Button(root, text='버튼', font=('맑은고딕', 18))
btn.pack()   # pack() - 가운데 위치
# btn.grid(row=0, column=0)

root.mainloop()