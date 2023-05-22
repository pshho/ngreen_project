import re

# text = 'awerio23'
# re.findall([a-zA-Z0-9], text)

# text1 = '\d+'
# text2 = r'\d+'

# print(text1, text2)

# buf = []

# 2차원 배열 나선형(달팽이) 순환 저장
n = 11
m = 11
a = []
b = []

i = 0
j = 0
c = 0

for i in range(n):
    b.append(c)

for j in range(m):
    a.append(list(b))

# print(a)

i = 0
j = 0
a[i][j] = 1
c = 2

z = (n // 2) + 1

for x in range(0, z):
    while i + 1 < n and a[i+1][j] == 0:
        i += 1
        a[i][j] = c
        c += 1

    while j + 1 < m and a[i][j+1] == 0:
        j += 1
        a[i][j] = c
        c += 1

    while i - 1 >= 0 and a[i-1][j] == 0:
        i -= 1
        a[i][j] = c
        c += 1

    while j - 1 >= 0 and a[i][j-1] == 0:
        j -= 1
        a[i][j] = c
        c += 1

i = 0
j = 0

for i in range(n):
    for j in range(m):
        if a[i][j] < 10:
            print(f'{a[i][j]} ', end=' ')
        else:
            print(f"{a[i][j]}", end=' ')
    print()
