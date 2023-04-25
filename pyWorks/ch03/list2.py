# 문자열 - 1차원 리스트
ss = '20230419Sunny'

# year = ss[0:4]
year = ss[:4]

# print(year)

# day = 월일
day = ss[4:8]

# print(day)

weather = ss[8:]

# print(weather)

ss2 = year + day + weather
# print(ss2)

# 문자열 관련 함수
# split(구분기호) → 문자열이 리스트로 변환
# 문자열.split()
fruit = 'banana,apple,strawberry'
fruitlist = fruit.split(',')

'''
print(fruitlist)
print(fruitlist[1]) # 1번 인덱스 → apple
'''

# replace('이전 문자', '새로운 문자')
str1 = 'Hello, World'
str1 = str1.replace('World', 'Korea')

# print(str1)

# format() - 순번 있음(0, 1... 숫자를 넣어줘도 되고 빼줘도 됨)
name = 'Mario'
year = 40
str2 = 'My name is {}. I am {} years old.'.format(name, year)
'''
str3 = 'My name is %s' % 'Mario'
name = 'Mario'
str4 = f'My name is {name}'
'''

'''
print(str2)
print(str3)
print(str4)
'''

# split() 예제 - ':'로 구분하고 리스트로 변경
'''
string = 'a:b:c:d'
string2 = string.split(':')

print(string2)
print(string2[-1])
'''

# 두 수를 동시에 입력을 받아서 더하기
'''
n1 = int(input('첫번째 수 입력: '))
n2 = int(input('두번째 수 입력: '))
print(n1 + n2)
'''

'''
n1, n2 = input('두 수 입력: ').split() # ()안에 아무것도 안쓰면 공백으로 구분
add = int(n1) + int(n2)

print(add)
'''

# find() - 문자열이 존재하는 위치 반환
'''
text = "Hello"
print(text.find('H'))       # 0
print(text.find('ll'))      # 2
print(text.find('k'))       # -1
print(text.find('Hello'))   # 0
'''

# 회원정보 출력하기
# 입력
name = input("이름 : ")
userid = input("아이디 : ")
pw = input("비밀번호 : ")
pw = '*' * len(pw)
idcard1 = input("주민등록번호 앞자리 : ")
idcard2 = input("주민등록번호 뒷자리 : ")
idcard2 = idcard2[0] + ('*' * (len(idcard2) - 1))

print('='*30)

#출력
strname = '이름 : {}'.format(name)
struserid = '아이디 : {}'.format(userid)
strpw = '비밀번호 : {}'.format(pw)
stridcard = '주민등록번호 : {0}-{1}'.format(idcard1, idcard2)

print(strname)
print(struserid)
print(strpw)
print(stridcard)
