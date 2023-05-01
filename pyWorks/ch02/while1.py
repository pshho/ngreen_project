# while 반복문
# 'hello'를 10번 출력
# i++은 사용할 수 없음
'''
i = 1

while i <= 10:
    print('hello~', i)
    i += 1
'''

# 1부터 10까지 더하기
'''
i = 0
sum_v = 0

while i < 10:
    i += 1
    sum_v += i
    print("i =", i, "sum_v =", sum_v)

print(f'합계 : {sum_v}')
'''

# 반복 조건문(break)
'''
i = 0
sum_v = 0

while True:
    i += 1
    if i > 10:
        break
    sum_v += i
    print(f'i={i}, sum_v={sum_v}')

print(f'합계 : {sum_v}')
'''

# 'y'를 입력하면 '반복 계속', 'n'을 입력하면 '반복 중단' 그외 '정상 답변이 아님'
while True:
    key = input("반복을 계속할까요?(y/n) ")
    if key == 'y' or key == '네' or key == 'Y' or key == '예':
        print("반복을 계속합니다.")
    elif key == 'n' or key == '아니요' or key == 'N' or key == '아니오':
        print("반복을 그만합니다.")
        break
    else:
        print("정상 답변이 아닙니다.")
















