# 쿠폰 추첨기
from tkinter import *
import random

namelist = [
    '이진성', '노승우', '박성호', '권지혜', '김은효',
    '이경철', '성의석', '이유진', '유성길', '한주훈',
    '강정현', '김현우', '이영준', '안재훈', '김민정',
    '유세현', '윤기은', '오화룡', '조은별', '이가은'
]

# 5명 랜덤 추첨
def click():
    pick = []

    while True:
        text = random.choice(namelist)

        if text not in pick:
            pick.append(text)

        if len(pick) == 5:
            break

    output.delete(0.0, END)

    '''
    for i in pick:
        output.insert(END, i + ' ')
    '''

    '''
    while len(pick) < 5:
        idx = random.randint(0, 19)

        if idx not in pick:
            pick.append(idx)

    output.delete(0.0, END)

    for i in pick:
        output.insert(END, namelist[i] + ' ')
    '''

    output.insert(END, ' '.join(pick))

window = Tk()
window.title('쿠폰 추첨기')
window.option_add('*Font', '맑은고딕 14')

# 이미지 넣기
img = PhotoImage(file='./images/bronx.png')

lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=0, column=0)

# 추첨 버튼
Button(window, text='추첨', command=click).grid(row=1, column=0, sticky=E)

# 이름 출력
output = Text(window, width=32, height=4, bg='yellow')
output.grid(row=2, column=0)

window.mainloop()