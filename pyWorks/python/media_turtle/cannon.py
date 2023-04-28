# 거북이 대포 게임
'''
1. 키보드 방향키로 발사 각도 조절
2. 화살촉 모양의 포탄이 하늘로 날아감
3. 스페이스바로 발사
'''
import turtle as t
import random
import tkinter

s = t.Screen()
image = './images/pngwing.gif'
s.addshape(image)

def turn_up():
    t.left(2)

def turn_down():
    t.right(2)

def fire():
    while True: # y좌표 - 포탄이 땅 위에 있는 동안
        t.forward(35)
        t.right(3)

        if t.ycor() < 35:
            break

    d2 = t.distance(target, 0)
    if d2 < 40: # 명중 - 목표지점에 닿음
        t.speed(0)
        t.hideturtle()
        t.sety(random.randint(20, 150))  # 성공 또는 실패 글자 표시 위치
        t.color('blue')
        t.write('축하합니다!', False, 'center', ('', 30))
    else: # 목표지점에 닿지 않았을 때
        t.shape(image)
        # t.color('red')
        # t.write('Bad!', False, 'right', ('', 30))
        # t.color('black')
        # t.goto(-650, 20)
        # t.setheading(30) # 미리 지정된 머리 각도로

def start():
    global target
    t.shape('turtle')
    t.shapesize(2, 2, 3)

    # 땅 그리기
    t.speed(0)
    t.hideturtle()
    t.goto(-700, 0)
    t.goto(700, 0)

    # 목표 지점 설정
    t.speed(3)
    target = random.randint(-50, 600) # 50 ~ 150 사이의 x좌표 한 지점
    t.color('green')
    t.pensize(2)
    t.up()
    t.goto(target-40, 2) # target = 100일 때 100-40=60
    t.down()
    t.goto(target+40, 2) # target = 100일 때 100+40=140

    # 포탄의 처음 위치
    t.color('black')
    t.up()
    t.goto(-650, 20)
    t.setheading(30)
    t.showturtle()

start()

def clear():
    t.clear()
    t.reset()
    t.speed(0)
    start()

# 거북이 대포가 동작하는 데 필요한 설정
t.onkeypress(turn_up, "Up")
t.onkeypress(turn_down, "Down")
t.onkeypress(fire, "space") # 스페이스 키 누르면 발사됨
t.onkeypress(clear, "Escape")
t.listen()

t.mainloop()



