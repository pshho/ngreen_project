# 매개변수를 리스트인 함수
# 리스트 복사 함수로
v = [1, 2, 3, 4, 5]

def get_list(a): # a라는 매개변수는 함수 호출의 매개변수 v와 같다
    a2 = []
    for i in a:
        a2.append(i * 2)
    return a2

print(get_list(v)) # [1, 2, 3, 4, 5]
