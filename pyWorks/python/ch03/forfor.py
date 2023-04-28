# 중첩 for문
# 5행 5열
'''
for i in range(5): # range(0, 5, 1)
    for j in range(5):
        print('$', end=' ')
    print()
'''

# 스타(*) 출력
# 삼각형 만들기
'''
*
**
***
****
*****
'''

'''
i=0, j=1
i=1, j=2
i=2, j=3
i=3, j=4
i=4, j=5
'''

for i in range(0, 5):
    for j in range(0, i+1):
        print('*', end=' ')
    print()

'''
i=0, j=5
i=1, j=4
i=2, j=3
i=3, j=2
i=4, j=1
'''

'''
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
'''

row = 5
col = 5

for i in range(0, row):
    for j in range(1, col+1):
        print(col*i+j, end=' ')
    print()

for i in range(0, 5):
    for j in range(1, 6):
        print(5*i+j, end=' ') # 5는 j의 종료값
    print()

'''
i=0, j=5
i=1, j=4
i=2, j=3
i=3, j=2
i=4, j=1
'''

for i in range(0, 5):
    for j in range(0, 5-i):
        print('*', end=' ')
    print()






