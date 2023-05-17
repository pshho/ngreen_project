# 가위바위보 게임
import random

def play():
    print("♠ 가위 바위 보 게임 ♠")
    가위바위보 = [['가위', '찍', '2'], ['묵', '바위', 'rock'], ['보자기', 'b', '보']]
    가위바위보2 = []

    for i in range(len(가위바위보)):
        for j in range(len(가위바위보)):
            가위바위보[1]
            가위바위보[2]

    you = input("가위, 바위, 보 중 하나 입력: ")
    num = random.randint(0, 2)
    com = random.choice(가위바위보[num])

    result = {0: '무승부', 1: '패', 2: '승'}
    state = 0  # 상태 변수(0/1/2)

    if you not in 가위바위보:
        print("잘못된 입력입니다. 다시 입력해주세요.")
    else:
        if you in 가위바위보[num]:
            state = 0
        elif you in 가위바위보[0] and com in 가위바위보[2]:
            state = 2
        elif you in 가위바위보[1] and com in 가위바위보[0]:
            state = 2
        elif you in 가위바위보[2] and com in 가위바위보[1]:
            state = 2
        else:
            state = 1
        return print(result[state]), print(you), print(com)

play()