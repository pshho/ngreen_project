# 성적 처리
# 학생 5명의 국어 점수 - 합계, 평균, 최고 점수, 최저 점수
A = [70, 80, 50, 60, 90]

# 개수
count = len(A)
# print(count)

# for ~ in
for i in A:
    print(i, end=' ')
print()

# for ~ in range() - 인덱스 방식
'''
for i in range(0, count):
    print(A[i], end=' ')
'''

# 합계
sum_v = 0

for i in A:
    sum_v += i
    print(f'i={i}, sum_v={sum_v}')
print(f'합계 : {sum_v}') 

# 평균 = 합계 / 개수
avg = sum_v / count
print(f'평균 : {avg:.1f}') # 소수 첫째자리(.1f)

# 최고 점수
# 내장함수 - sum(), max()
# print(sum(A))
# print(max(A))

max_v = A[0]

for i in A:
    if max_v < i:
        max_v = i
print(f'최고 점수 : {max_v}')
