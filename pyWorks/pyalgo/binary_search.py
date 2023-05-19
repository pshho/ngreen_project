# 이분 탐색
'''
자료가 크기 순서대로 정렬된 리스트에서 특정한 값이 있는지
찾아 그 위치를 돌려주는 알고리즘

☆ 탐색 과정
1. 중간 위치를 찾는다.
2. 찾는 값과 중간 위치값을 비교한다.
3. 찾는 값이 중간 위치값보다 크면 중간 위치의 오른쪽을 대상으로
   탐색하고, 작으면 왼쪽을 대상으로 탐색한다.
'''

def bin_search(a, x):   # 리스트 a와 x(찾는 값)
    start = 0
    end = len(a) - 1    # 마지막 인덱싱 번호

    while start <= end:  # 탐색할 범위가 있는 동안 반복
        mid = (start + end) // 2  # 탐색 범위의 중간 위치

        if x == a[mid]:
            return mid  # 위치값 찾음
        elif x > a[mid]:
            start = mid + 1 # 오른쪽 범위로 좁혀 탐색
            # continue
        else:   # 찾는 값이 중간보다 작으면
            end = mid - 1   # 왼쪽 범위로 좁혀 탐색
            # continue

    return -1   # 찾는 값이 없음

# d = [1, 4, 9, 16, 25, 36, 49, 64, 81]
d = [49, 4, 64, 25, 36, 81, 16, 9, 1]
d.sort()

print(bin_search(d, 49))    # 6
print(bin_search(d, 50))    # -1
print(bin_search(d, 9))     # 2
print(bin_search(d, 81))    # 8
print(bin_search(d, 16))    # 3
