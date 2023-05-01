# turtle run 게임
import turtle as t
import random

s = t.Screen()
image1 = './images/sl.gif'
image2 = './images/pg.gif'
image3 = './images/mm.gif'
s.addshape(image1)
s.addshape(image2)
s.addshape(image3)

# 주인공 거북이
t.shape(image2)
t.setup(500, 500) # width, height
t.bgcolor('orange')
t.color('white')
t.speed(0)
t.up()

# 적 거북이 생성
te = t.Turtle()
te.hideturtle()
te.shape(image1)
te.color('red')
te.speed(0)
te.up()
te.goto(0, 200)

# 먹이 생성
tf = t.Turtle()
tf.hideturtle()
tf.shape(image3)
tf.color('green')
tf.speed(0)
tf.up()
tf.goto(0, -200)

# 점수 거북이
ts = t.Turtle()
ts.hideturtle()
ts.shape('turtle')
ts.color('white')
ts.speed(0)
ts.up()
ts.goto(0, -100)

# 스타트 글씨 거북이
tt = t.Turtle()
tt.hideturtle()
tt.up()
tt.color('white')
tt.speed(0)

score = 0
playing = False

def play():
    global score, playing
    playing = True

    # 적 거북이에 닿지 않으면 게임 유지
    # 적 거북이와 닿으면 게임 종료
    if t.distance(te) > 15:
        t.ontimer(play, 100) # 0.1초 간격으로 계속 play 호출

        t.forward(10)
        te.forward(8)
    else:
        playing
        ts.goto(0, 100)
        ts.write('Game Over!!', False, 'center', ('', 20))
        ts.goto(0, 0)
        ts.write('다시 시작하시겠습니까?', False, 'center', ('', 20))
        ts.goto(0, -30)
        ts.write('ESC를 눌러주세요', False, 'center', ('', 20))

    # 적 거북이가 주인공을 위치를 쫒아옴
    # 방향을 알아채는데 20% 확률로 적용
    if random.randint(1, 5) == 4:
        ang = te.towards(t.pos())
        te.setheading(ang)

    speed = 9
    if score % 5 == 0 and score != 0:
        speed += 1
        te.forward(speed)

    # 주인공 거북이가 먹이에 닿으면 먹이가 새 위치에서 랜덤하게 나타남
    if t.distance(tf) < 12:
        score += 1

        ts.clear()
        ts.write(f'Score: {score}', False, 'center', ('', 20))

        x = random.randint(-230, 230)
        y = random.randint(-230, 230)
        tf.goto(x, y)

        return score

def message():
    tt.hideturtle()
    tt.goto(0, 100)
    tt.write('Turtle Run', False, 'center', ('', 20))
    tt.goto(0, -100)
    tt.write('Start = Space', False, 'center', ('', 20))

message()

def start():
    tt.clear()
    te.showturtle()
    tf.showturtle()
    play()

def turn_right():
    t.setheading(0)

def turn_up():
    t.setheading(90)

def turn_left():
    t.setheading(180)

def turn_down():
    t.setheading(270)

t.onkeypress(turn_right, 'Right')
t.onkeypress(turn_up, 'Up')
t.onkeypress(turn_left, 'Left')
t.onkeypress(turn_down, 'Down')
t.onkeypress(start, 'space')
# t.onkeypress(restart, 'Escape')
t.listen()

t.mainloop()