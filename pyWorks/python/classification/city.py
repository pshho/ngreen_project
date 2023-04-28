class City:
    a = ['Seoul', 'Incheon', 'Daejon', 'Jeju']  # 클래스리스트

c = City()
print(c.a)

str1 = ''
for i in City.a: # 클래스
    # 이름으로 직접 접근
    str1 += i[0]

print(str1)