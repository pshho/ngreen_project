'''
★ 가위, 바위, 보 게임 만들기
- 게임방법
1. 당신(you)은 가위, 바위, 보 중 하나를 입력한다.
2. 컴퓨터(com)는 가위, 바위, 보 중 하나를 랜덤 생성한다.
3. 결과 출력은 무승부, 패, 승이다.
4. 잘못 입력한 경우 "잘못된 입력입니다. 다시 입력해주세요."
'''
import random
import sys

rps = ['가위', '바위', '보']
you = input("가위, 바위, 보 중 하나를 입력해주세요: ")
com = random.choice(rps)

if you not in rps:
    print("잘못된 입력입니다. 다시 입력해주세요.")
else:
    print(f'당신: {you}')
    print(f'컴퓨터: {com}')

    if you == com:
        print("무승부입니다.")
    elif you == rps[0]:
        if com == rps[1]:
            print('컴퓨터 승')
        else:
            print('당신의 승리입니다.')
    elif you == rps[1]:
        if com == rps[2]:
            print('컴퓨터 승')
        else:
            print('당신의 승리입니다.')
    elif you == rps[2]:
        if com == rps[0]:
            print('컴퓨터 승')
        else:
            print('당신의 승리입니다.')

'''
if you not in rps:
    print("잘못된 입력입니다. 다시 입력해주세요.")
    sys.exit(0)  # 프로그램 종료 모듈

print(f'당신: {you}')
print(f'컴퓨터: {com}')

if you == com:
    print("무승부입니다.")
elif you == rps[0] and com == rps[2]:
    print('당신의 승리입니다.')
elif you == rps[1] and com == rps[0]:
    print('당신의 승리입니다.')
elif you == rps[2] and com == rps[1]:
    print('당신의 승리입니다.')
else:
    print('컴퓨터 승')
'''