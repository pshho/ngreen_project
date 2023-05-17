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

가위바위보 = [['가위', '찍', '2'], ['묵', '바위', 'rock'], ['보자기', 'b', '보']]
x = [rps for row in 가위바위보 for rps in row]

