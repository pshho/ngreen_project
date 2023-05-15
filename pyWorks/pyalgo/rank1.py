# 순위 정하기
score = [60, 5, 33, 12, 97, 24]
rank = [1, 1, 1, 1, 1, 1]
n = len(score)
# print(n)

# 중첩 for문 - 조건문
for i in range(n):
    for j in range(n):
        if score[i] < score[j]:
            rank[i] += 1    # 순위 1증가(순위가 밀림)

'''
    i=0 < j=0 60 < 60 False
    i=0 < j=1 60 < 5  False
    i=0 < j=2 60 < 33 False
    i=0 < j=3 60 < 12 False
    i=0 < j=4 60 < 97 True rank[0] = 2(순위 확정)
    i=0 < j=5 60 < 24 False
    i=1 < j=0 5 < 60  True rank[1] = 2
    i=1 < j=1 5 < 5   False
    i=1 < j=2 5 < 33  True rank[1] = 3
    i=1 < j=3 5 < 12  True rank[1] = 4
    i=1 < j=4 5 < 97  True rank[1] = 5
    i=1 < j=5 5 < 24  True rank[1] = 6(순위 확정)
    i=2 < j=0 33 < 60 True rank[2] = 2
    i=2 < j=1 33 < 5  False
    i=2 < j=2 33 < 33 False
    i=2 < j=3 33 < 12 False
    i=2 < j=4 33 < 97 True rank[2] = 3(순위 확정)
    i=2 < j=5 33 < 24 False
    i=3 < j=0 12 < 60 True rank[3] = 2
    i=3 < j=1 12 < 5  False
    i=3 < j=2 12 < 33 True rank[3] = 3
    i=3 < j=3 12 < 12 False
    i=3 < j=4 12 < 97 True rank[3] = 4
    i=3 < j=5 12 < 24 True rank[3] = 5(순위 확정)
    i=4 < j=0 97 < 60 False
    i=4 < j=1 97 < 5  False
    i=4 < j=2 97 < 33 False
    i=4 < j=3 97 < 12 False
    i=4 < j=4 97 < 97 False
    i=4 < j=5 97 < 24 False rank[4] = 1(순위 확정)
    i=5 < j=0 24 < 60 True rank[5] = 2
    i=5 < j=1 24 < 5  False
    i=5 < j=2 24 < 33 True rank[5] = 3
    i=5 < j=3 24 < 12 False
    i=5 < j=4 24 < 97 True rank[5] = 4(순위 확정)
    i=5 < j=5 24 < 24 False
'''

print(rank)