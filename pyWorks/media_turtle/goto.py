# 좌표 이동 - t.goto(x, y)
import random
import turtle as t
import time

t.shape('turtle')
t.shapesize(4, 4, 4)
t.speed(1)

'''
t.up()
time.sleep(1) # 1초 대기
t.goto(0, 150)
time.sleep(1)
t.goto(100, 150)
time.sleep(1)
t.goto(0, 0)
t.down()
'''

# 실행 시 랜덤하게 보임
'''
x = random.randint(-250, 250)
y = random.randint(-250, 250)

t.up()
t.goto(x, y)
t.down()
'''

# 마음대로 걷는 거북이
'''
for x in range(300):
    ang = random.randint(1, 360) # 랜덤 각도 저장

    t.up()
    t.setheading(ang)
    t.forward(10)
'''

while True:
    ang = random.randint(1, 360)

    t.up()
    t.setheading(ang)
    t.forward(50)

t.mainloop()