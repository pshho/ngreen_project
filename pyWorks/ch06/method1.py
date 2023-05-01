# 함수 - function, method(메서드)
# 1부터 10까지 출력
import time

'''
for i in range(1, 11):
    print(i)
'''

# 1부터 n까지 출력하는 함수
def get_num(x):
    for i in range(1, x+1):
        print(i, end=' ')

if __name__ == '__main__':
    get_num(20)

# 1부터 n까지 합계를 구하는 함수
# n번 만큼 계산 진행 n에 비례(O(n))
# start = time.time()
def get_sum(n):
    sum_v = 0
    for i in range(1, n+1):
        sum_v += i

    return sum_v

if __name__ == '__main__':
    print(f'합계: {get_sum(100000000)}')
    # end = time.time()
    # print(f'소요시간: {end-start}초')

# 계산복잡도가 - 곱셈, 덧셈, 나눗셈할 때 더 빠름(O(1))
# start2 = time.time()
def get_sum2(n):
    sum_v = (n * (n+1)) // 2

    return sum_v

if __name__ == '__main__':
    print(f'합계: {get_sum2(100000000)}')
    # end2 = time.time()
    # print(f'소요시간: {end2-start2}초')