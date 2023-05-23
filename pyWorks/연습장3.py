import re

num = "640713-1018433"
regExp1 = r"\s"
regExp2 = r"\d"

find1 = re.findall(regExp1, num)
find2 = re.findall(regExp2, num)
find3 = num.rfind(' ')

# print(find1)
print(find2)
# print(type(len(find2)))
# print(find3)
# print(len(find2))

# char = 'a'
# print(ord('a'))

a = []
b = 0
e = len(find2) - 1
for i in range(e):
    if i > 7:
        b = int(find2[i]) * (2 + (i - 8))
        a.append(b)
    else:
        b = int(find2[i]) * (2 + i)
        a.append(b)

print(a)

c = 0
for i in range(e):
    c += a[i]

d = 11 - (c % 11)

if d == 10:
    d = 0
elif d == 11:
    d = 1
else:
    d = 11 - (c % 11)

print(c)
print(c % 11)
print(d)
print(find2[-1])

if d == int(find2[-1]):
    print("주민등록번호가 맞습니다.")
else:
    print("주민등록번호가 아닙니다.")
