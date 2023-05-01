# 교통수단 이용
# &&, ||, ! 사용하지 않음, 대신 and, or, not
'''
money = 3000
card = False

if money >= 4000 or card:
    print("택시를 탄다")
elif money >= 2000 or not card:
    print("버스를 탄다")
else:
    print("걸어간다")
'''

pocket = ['paper', '스마트폰', 'money']

'''
print('paper' in pocket) # True
print('coin' in pocket) # False
'''

if 'paper' in pocket:
    print('버스를 탄다')
else:
    print('걸어간다')
