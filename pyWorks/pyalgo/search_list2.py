# 순차 탐색
# 학생 번호에 해당하는 이름을 순차 탐색으로 찾아
# 돌려주는 함수를 작성하세요(단, 학생번호 없으면 '?'를 반환함)
def search_list(a, b, x):
    n = len(a)
    for i in range(n):
        if a[i] == x:
            return b[i]
    return '?'

v = [60, 5, 33, 12, 97]
name = ['이순신', '강감찬', '서희', '안중근', '유관순']

print(search_list(v, name, 33))     # 서희
print(search_list(v, name, 100))    # ?
print(search_list(v, name, 60))     # 이순신