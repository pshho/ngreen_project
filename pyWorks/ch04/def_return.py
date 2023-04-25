# 함수 - return이 있는 함수
def one_up(): # 1을 더하는 함수
    x = 0 # 지역변수 - 한 번하고 소멸
    x += 1 # x = x + 1
    return x

def square(x): # 제곱수를 계산하는 함수(매개변수 O)
    val = x * x
    return val

def add(x, y): # 두 수를 더하는 함수
    val = x + y
    return val

# one_up() 호출
'''
print(one_up()) # 1
print(one_up()) # 1 - 부를 때 마다 새롭게 실행
'''

if __name__ == '__main__':
    # square() 호출
    print(square(2)) # 4

    result = square(3)

    print(result)   # 9

    # add() 호출
    print(add(3, 4)) # 7


