# map(), filter()
# 리스트를 매개변수로 전달
# map() 함수 사용
def times(x):
    return 3 * x

times2 = lambda x : 3 * x
v = [1, 2, 3, 4]

# map(함수, 리스트)
result = map(times, v)

print(list(result))

def times3(a):
    a2 = []

    for i in a:
        a2.append(3 * i)

    return a2

# print(times3(v))

# filter() 사용
# 음의 정수를 출력하시오
def negative2(n):
    return n < 0

li = [-5, 1, 2, -11, 76]

negative = lambda x : x < 0
# filter(함수, 리스트)
value = filter(negative2, li)

print(list(value))

