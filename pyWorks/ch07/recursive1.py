# 재귀함수
# 종료조건을 항상 명시(if ~ else)
# 1부터 10까지 곱하기
# 패턴을 코드화
''' # 재귀함수 패턴
    def func(입력값):
        if 입력값이 충분히 작으면:    # 종료조건
            return 결과값
        else:   # 입력값보다 더 작은 값으로 호출
            return 결과값
'''
import time

def getgob(n):
    gob = 1  # 곱셈에서는 1을 할당

    for i in range(1, n+1):
        gob *= i

    return gob

# getgob() 호출
# print(getgob(5))

# 재귀함수
# 5X4(5-1)X3(4-1)X2(3-1)X1(2-1) = 5!(팩토리얼, 계승)
def facto(n):
    if n == 1:
        return 1
    else:
        return n * facto(n-1)

'''
    n=5, 5 * facto(4) - 5 * 4
    n=4, 5 * 4 * facto(3) - 5 * 4 * 3
    n=3, 5 * 4 * 3 * facto(2) - 5 * 4 * 3 * 2
    n=2, 5 * 4 * 3 * 2 * facto(1) - 5 * 4 * 3 * 2 * 1
    n=1, 1
'''

print(facto(10))

def sos(n):
    print("Help me!")
    # 종료조건
    if n == 1:
        return ""
    else:
        return sos(n-1)

'''
    n=3, sos(2)
    n=2, sos(1)
    n=1, ""
'''

# sos(5)

