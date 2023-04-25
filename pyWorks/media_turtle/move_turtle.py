# turtle 모듈
import turtle as t

t.shape('turtle')

'''
# 사각형을 그리며 이동
# forward(픽셀크기) - 직진
t.forward(100) # 직진 100px

# left(각도)
t.left(90) # 머리방향이 왼쪽으로 90도

t.forward(100)
t.left(90)
t.forward(100)
t.left(90)
t.forward(100)
t.left(90)

t.mainloop()
'''

'''
for i in range(4):
    t.forward(100)
    t.left(90)

t.mainloop()
'''


# 삼각형을 그리며 이동
'''
t.forward(100)
t.left(120)
t.forward(100)
t.left(120)
t.forward(100)
t.left(120)

t.mainloop()
'''

for i in range(4):
    t.forward(100)
    t.right(90)

t.color('blue')
for i in range(3):
    t.forward(100)
    t.left(120)

t.color('red')
t.pensize(3)
t.circle(50) # 반지름 50px인 원

t.mainloop()