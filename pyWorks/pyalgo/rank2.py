# 순위 정하기
score = [60, 5, 33, 12, 97, 24, 100]
rank = [0, 0, 0, 0, 0, 0, 0]   # 리스트 요소 0으로 초기화
n = len(score)
# print(n)

# 중첩 for문 - 조건문
for i in range(n):
    count = 1   # for구문의 로컬(지역) 변수
    for j in range(n):
        if score[i] < score[j]:
            count += 1
        rank[i] = count # 변경된 count를 rank 리스트에 저장

print(rank)