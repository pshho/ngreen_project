# 다각형 그리기
import turtle as t

t.shape('turtle')

def polygon(n):
    for i in range(n):
        t.forward(50)
        t.left(360/n)

def polygon2(n, d):
    for i in range(n):
        t.forward(d)
        t.left(360/n)

polygon(3)
polygon(5)

t.up()
t.forward(100)
t.down()

polygon2(3, 100)
polygon2(5, 100)

'''
t.up() # 펜 올리기
t.left(90)
t.forward(100)
t.down() # 펜 내리기

for i in range(3):
    t.forward(100)
    t.left(120)
'''

t.mainloop()
