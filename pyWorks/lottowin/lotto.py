#!/usr/bin/env python
# coding: utf-8

# ## 로또 당첨 번호 가져오기

# In[24]:


import requests
from bs4 import BeautifulSoup

'''
num = 1063
url = 'https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo={}'.format(num)

response = requests.get(url)
# print(response.text)

soup = BeautifulSoup(response.text, 'html.parser')
win_result = soup.select_one('div.win_result') # 태그이름.클래스이름
# win_result.text # '\n' 확인

# win_list = win_result.text.split('\n')
# win_list

win_list = win_result.text.split('\n')[7:13]
# win_list

bonus_num = win_result.text.split('\n')[-4]
# bonus_num

print('당첨번호')
print(win_list)
print('보너스번호')
print(bonus_num)
'''

# ## 로또 당첨 확인앱 제작

# In[61]:


import requests
from bs4 import BeautifulSoup
from tkinter import *

def enter(key):
    btn.invoke()

def lotto_win():
    num = entry.get() # 입력박스에 입력된 값
    url = 'https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo={}'.format(num)

    response = requests.get(url)
    soup = BeautifulSoup(response.text, 'html.parser')
    win_result = soup.select_one('div.win_result')
    win_list = win_result.text.split('\n')[7:13]
    bonus_num = win_result.text.split('\n')[-4]

    # 출력
    entry.delete(0, END)
    output.delete(0.0, END)
    
    text = '당첨번호: {}\n보너스번호: {}'.format(' '.join(win_list), bonus_num)
    output.insert(END, text)

# lotto_win()

window = Tk()
window.title('로또 당첨 확인')
window.bind("<Return>", enter)

Label(window, text='당첨 회차 입력: ').grid(row=0, column=0, sticky=W)
entry = Entry(window, width=22)
entry.grid(row=0, column=1)
btn = Button(window, text='당첨 번호 확인', command=lotto_win)
btn.grid(row=0, column=2, sticky=E)

# 출력상자
output = Text(window, bg='skyblue', width=48, height=5)
output.grid(row=1, columnspan=3)

window.mainloop()







