# 2차원 리스트 - 3행 2열(표형태로 인식)
# 입력(기억, 저장)
a = [
    [10, 20],
    [20, 30],
    [30, 40]
]

# 출력
'''
print(a[0][0]) # 10
print(a[0][1]) # 20
print(a[1][0]) # 20
print(a[1][1]) # 30
'''

# 2차원 리스트에서 요소 추가 - 리스트 추가
a.append([70, 80])

# 전체 출력
'''
for x, y in a:
    print(x, y)
'''

'''
b = [1, 2, 3, 4]
b.append(10)
# len(b) # 4
print(b)
'''

'''
print('2차원 리스트 크기(행):', len(a))
print('2차원 리스트 크기(첫번째 행의 열수):', len(a[0]))
print('2차원 리스트 크기(두번째 행의 열수):', len(a[1]))
'''

# for ~ range()
for i in range(0, len(a)): # len(a) = 3, 3 - 1 = 2
    for j in range(0, len(a[i])):
        print(a[i][j], end=' ')
    print()

# 리스트의 연산(합계)
total = 0
count = 0

for i in range(0, len(a)):
    for j in range(0, len(a[i])):
        total += a[i][j]
        count += 1

'''
    i = 0, j = 0 == 10 / total = 10
           j = 1 == 20 / total = 30
    i = 1, j = 0 == 20 / total = 50
           j = 1 == 30 / total = 80
    i = 2, j = 0 == 30 / total = 110
           j = 1 == 40 / total = 150
    i = 3, j = 0 == 70 / total = 220
           j = 1 == 80 / total = 300
'''

# 평균 구하기
avg = total / (len(a) * len(a[0]))

print(f'합계 : {total}')
print(f'개수 : {count}')
print(f'평균 : {avg}')
print(total)
print(avg)