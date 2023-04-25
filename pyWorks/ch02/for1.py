# for ~ in range
# for 변수 in range(시작, 종료, 증감):
# 1부터 10까지 출력
# range(시작값, 종료값, 증감값)
'''
for i in range(1, 11, 1):
    print(i, end=' ')
print()

for i in range(10, 0, -1):
    print(i, end=' ')
print()
'''
# 1부터 10까지 합계
'''
sum_v = 0
for i in range(1, 11):
    sum_v += i
    print(f'i={i}, sum_v={sum_v}')
print(f'합계: {sum_v}')
'''

# 1부터 10까지의 홀수 출력
'''
for i in range(0, 5):
    x = 2 * i + 1
    print(x, end=' ')
print()

for i in range(1, 11, 1):
    if i % 2 == 1:
        print(i, end=' ')
'''

num = [10, 50, 30, 70]

'''
print(50 in num)
print(80 in num)
'''

# 리스트 출력
# print(num)

# 전체 요소를 출력
for i in num:
    print(i, end=' ')
print()

# 50보다 큰 수를 출력
for i in num:
    if i > 50:
        print(i)

city = ['Seoul', 'Incheon', 'Gwangju']
for i in city:
    # print(i)
    # i는 리스트의 값을 배당받고 i는 자체적으로 배열을 형성 따라서 i[0]은 맨 앞글자
    print(i[0], end=' ')
    '''
    city[0] : i = Seoul    → i[0] = 'S'
    city[1] : i = Incheon  → i[0] = 'I'
    city[2] : i = Gwangju  → i[0] = 'G'
    '''


