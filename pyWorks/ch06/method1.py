# 함수 - function, method(메서드)
# 1부터 10까지 출력
'''
for i in range(1, 11):
    print(i)
'''

# 1부터 n까지 출력하는 함수
'''
def get_num(x):
    for i in range(1, x+1):
        print(i, end=' ')

get_num(20)
'''

# 1부터 n까지 합계를 구하는 함수
def get_sum(n):
    sum_v = 0
    for i in range(1, n+1):
        sum_v += i

    return sum_v

print(f'합계: {get_sum(10)}')

# 1