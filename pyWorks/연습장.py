import random

'''
text = input('입력하세요 : '
             ''
             ''
             '')
# print(text)

words = ['dog', 'cat', 'monkey', 'chicken', 'frog', 'horse']
word = 'chicken'
guessed_letters = 'c'
a = ['g', 'o', 'r', 'f']
b = 'frog'
a.sort()
b = list(b)
b.sort()
print(a)
print(b)
print(guessed_letters.find(word))
'''

# 가위바위보 = [['가위', '찍', '2'], ['묵', '바위', 'rock'], ['보자기', 'b', '보']]
# x = [rps for row in 가위바위보 for rps in row]
'''
i = 1
while i <= 5:
    j = 1
    while j <= i - 1:
        print("o", end=' ')
        j += 1
    print("*")
    i += 1
'''

a = list((input("숫자 10개 입력(ex. 1, 2, 3 ···)(1~100까지): ")).split(', '))
count = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
text = []

for row in a:
    if int(row) >= 1 and int(row) <= 10:
        count[0] += 1
    elif int(row) >= 11 and int(row) <= 20:
        count[1] += 1
    elif int(row) >= 21 and int(row) <= 30:
        count[2] += 1
    elif int(row) >= 31 and int(row) <= 40:
        count[3] += 1
    elif int(row) >= 41 and int(row) <= 50:
        count[4] += 1
    elif int(row) >= 51 and int(row) <= 60:
        count[5] += 1
    elif int(row) >= 61 and int(row) <= 70:
        count[6] += 1
    elif int(row) >= 71 and int(row) <= 80:
        count[7] += 1
    elif int(row) >= 81 and int(row) <= 90:
        count[8] += 1
    elif int(row) >= 91 and int(row) <= 100:
        count[9] += 1

for i in range(10):
    text.append("*" * int(count[i]))


