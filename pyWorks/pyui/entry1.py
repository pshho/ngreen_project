# 이름(문자열)을 입력받고 화면에 출력하기
from tkinter import *

def click():
    text = entry.get()  # 입력상자에 가져온 내용
    output.delete(0.0, END) # delete(문자열 시작 위치, 문자열 끝 위치)
    output.insert(0.0, text) # text를 출력상자에 삽입, END - 텍스트의 마지막 문자 위치

root = Tk()
root.title("입력 및 출력")
root.geometry("500x300")
root.option_add("*Font", "맑은고딕 20")

Label(root, text='이름 : ').grid(row=0, column=0)
entry = Entry(root, width=15)   # 쓴 걸 가져오는 get() 함수 있음
entry.grid(row=0, column=1)

btn = Button(root)
btn.config(text='확인', command=click, font=("맑은고딕", 16))
btn.grid(row=1, columnspan=2)

output = Text(root, width=20, height=5) # get()으로 가져온 걸 대입해주는 insert() 함수
output.grid(row=2, columnspan=2)

root.mainloop()