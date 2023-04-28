# 지역변수와 전역변수
'''
def one_up(x): # 1을 더하는 함수
    x = 0  # 지역변수 - 한 번하고 소멸
    x += 1 # x = x + 1
    return x

print(one_up()) # 1
print(one_up()) # 1
'''

# 전역변수는 값을 공유 및 누적 저장
# 프로그램 종료시 메모리에서 소멸
x = 0
def one_up2():
    global x # 전역변수임을 알려주는 키워드
    x += 1
    return x

print(one_up2()) # 1
print(one_up2()) # 2
print(one_up2()) # 3
print(one_up2()) # 4
print(one_up2()) # 5
print(one_up2()) # 6
print(one_up2()) # 7
print(one_up2()) # 8
print(one_up2()) # 9
print(one_up2()) # 10

print(x)






for i in range(0, 5):
    for j in range(0, 5):
        print(' ', end=' ')
        if i == 0 and j == 2:
            print('*', end=' ')
        elif (i == 1 and j == 1) or (i == 1 and j == 2):
            print('*', end=' ')
    print()