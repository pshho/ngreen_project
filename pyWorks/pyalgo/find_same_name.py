# 동명 이인 찾기 - 중복값 찾기
def find_same_name(a):
    # 리스트 사용: same_name = list(), same_name.append(a[i])도 가능
    same_name = set()   # 중복값 기억할 빈 집합 생성
    n = len(a)

    for i in range(0, n-1):
        for j in range(i+1, n):
            if a[i] == a[j]:
                # 중복값 찾기
                same_name.add(a[i])

    return same_name

'''
    name[0] == name[1] 흥부 콩쥐 False
    name[0] == name[2] 흥부 놀부 False
    name[0] == name[3] 흥부 콩쥐 False
    name[1] == name[2] 콩쥐 놀부 False
    name[1] == name[3] 콩쥐 콩쥐 True {콩쥐} - 중복값 찾음
    name[2] == name[3] 놀부 콩쥐 False
'''

name = ['흥부', '콩쥐', '놀부', '콩쥐']

print(find_same_name(name))
