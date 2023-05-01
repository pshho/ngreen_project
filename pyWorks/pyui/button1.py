# 버튼 이벤트
# 버튼 클릭하면 문자열이 출력되는 윈도우
# root → Frame(프레임).pack() → 버튼(Button).grid() 생성 순으로 작업
from tkinter import *

def click():
    # print("Hello~ python!!") - 콘솔에 출력
    lbl.config(text="안녕! 파이썬!")

root = Tk() # root 객체 생성
root.title('버튼 클릭')
root.geometry("300x200")

# 전체 폰트 설정
root.option_add("*Font", "맑은고딕 15")

frame = Frame(root)
frame.pack()    # 가운데 정렬

# 라벨(레이블 - 출력)
Label(frame, text='').grid(row=0, column=0)
lbl = Label(frame)
lbl.config(text="Hello python!!")
lbl.grid(row=1, column=0)

# click 함수지만 '()' 괄호를 하면 함수 생성 시점에서 작동하고, 괄호를 생략하면
# 클릭이 발생한 때 작동함
Button(frame, text='확인', command=click).grid(row=2, column=0)
# 클릭하면 문자를 출력할 라벨 생성
demo_lbl = Label(frame, text='')
demo_lbl.grid(row=3, column=0)

root.mainloop()