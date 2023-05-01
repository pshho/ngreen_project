# 배수를 구하는 함수를 정의하고 사용
# 배수의 개수 구하기
x = int(input("자연수를 입력하세요(1~100): "))
count = 0
def times(x):
    global count
    for i in range(1, 101):
        if i % x == 0:
            count += 1
            print(i, end=' ')
    print(f'개수는 {count}개')

times(x)