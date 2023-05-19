# 숫자 추측게임
'''
게임 방법
- 게임이 시작되면 컴퓨터가 난수(정답)를 생성한다
- 사용자의 추측값이 정답과 같으면 '정답!'
  추측값이 정답보다 크면 '너무 커요!'
  추측값이 정답보다 작으면 '너무 작아요!' 출력
'''

import random

com = random.randint(1, 100)
# count = 10
min_v = 1
max_v = 100

'''
while True:
    try:
        guess = int(input(f"숫자 추측({min_v}~{max_v} 중 하나): "))
        
        if count == 0:
        print("아쉽습니다.")
        break
    else:
        if guess == com:
            count -= 1
            print("정답!")
            print("점수:", (count*10))
            print(count)
            break
        elif guess < com:
            count -= 1
            if guess > min_v:
                min_v = guess
            print("너무 작아요!")
        else:
            count -= 1
            if guess < max_v:
                max_v = guess
            print("너무 커요!")
        
    except ValueError:
        print("숫자를 입력해주세요.")
        continue
'''

for i in range(1, 11):
    try:
        guess = int(input(f"숫자 추측({min_v}~{max_v} 중 하나): "))

        if guess > 100 or guess < 1:
            print("입력 범위가 아닙니다. 다시 입력해주세요.")
            continue
        else:
            if guess == com:
                print("정답!")
                print("점수:", ((10 - i + 1) * 10))
                break
            elif guess < com:
                if guess > min_v:
                    min_v = guess
                print("너무 작아요!")
            else:
                if guess < max_v:
                    max_v = guess
                print("너무 커요!")

            if i == 10:
                print()
                print("아쉽습니다.")

    except Exception as e:
        print("숫자를 입력해주세요.")
        continue