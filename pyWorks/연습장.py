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

for i in range(10):
    if i == 0:
        print("1 - 10:", text[i])
    elif i == 1:
        print("11 - 20:", text[i])
    elif i == 2:
        print("21 - 30:", text[i])
    elif i == 3:
        print("31 - 40:", text[i])
    elif i == 4:
        print("41 - 50:", text[i])
    elif i == 5:
        print("51 - 60:", text[i])
    elif i == 6:
        print("61 - 70:", text[i])
    elif i == 7:
        print("71 - 80:", text[i])
    elif i == 8:
        print("81 - 90:", text[i])
    elif i == 9:
        print("91 - 100:", text[i])
'''

c = ['', '', '', '', '', '', '', '', '', '']

i = 0
while i < 10:
    b = int(input("숫자 입력(1~100 중): "))
    text = ['1 - 10:', '11 - 20:', '21 - 30:', '31 - 40:', '41 - 50:',
            '51 - 60:', '61 - 70:', '71 - 80:', '81 - 90:', '91 - 100:']

    if 1 <= b and b <= 10:
        c[0] += '*'
    elif 11 <= b and b <= 20:
        c[1] += '*'
    elif 21 <= b and b <= 30:
        c[2] += '*'
    elif 31 <= b and b <= 40:
        c[3] += '*'
    elif 41 <= b and b <= 50:
        c[4] += '*'
    elif 51 <= b and b <= 60:
        c[5] += '*'
    elif 61 <= b and b <= 70:
        c[6] += '*'
    elif 71 <= b and b <= 80:
        c[7] += '*'
    elif 81 <= b and b <= 90:
        c[8] += '*'
    elif 91 <= b and b <= 100:
        c[9] += '*'

    for j in range(10):
        print(text[j], c[j])

    print()

    i += 1
