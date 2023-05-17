# 순차 탐색
# 리스트의 첫번째 자료부터 하나씩 비교하면서 같은 값이 나오면
# 그 위치를 돌려주고(반환), 못찾으면 -1을 반환함
def search_list(a, x):
    n = len(a)
    for i in range(n):
        if a[i] == x:
            return i
    return -1

def search_list2(a, x):
    num = []
    n = len(a)
    for i in range(n):
        if a[i] == x:
            num.append(i)

    if len(num) == 0:
        return "값을 찾을 수 없습니다."
    else:
        return num

v = [60, 5, 33, 12, 97, 24, 5 ,12]

# 매개변수 - 리스트, 찾는 값
'''
print(search_list(v, 5))    # 1
print(search_list(v, 12))   # 3
print(search_list(v, 100))  # -1
'''

# 중복값 위치 찾기
print(search_list2(v, 5))
print(search_list2(v, 100))
print(search_list2(v, 2))
print(search_list2(v, 12))

'''
for i in range(n):
    if 12 == v[i]:
        num += i
        print("찾음")
    else:
        print("못찾음")

print(num)
'''