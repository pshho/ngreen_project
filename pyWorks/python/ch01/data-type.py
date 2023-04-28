# 주석
# 자료형 - 숫자, 문자, 불리언, 리스트, 객체
# 여러 줄 주석: 쌍따옴표, 홑따옴표(""", ''') 3개를 쌍으로 적음
'''
    print(12)
    print(type(12)) # type() - 자료형 확인하는 함수 <int - integer(정수형)>

    print(3.3)
    print(type(3.3)) # <float - 실수형)
'''

n = 1 # 변수 선언 방법 - 자료형은 생략(파이썬만)
print('n =', n, '개') # ,(한 칸 띄움)
print('n = ' + str(n) + '개') # str(숫자) - 문자로 변환

msg = "좋은 하루!!"
print('메시지 :', msg)
# print(type(msg))

num = int('120') # int(문자형) - 정수로 변환
print(num)
print(type(num))

num2 = int(120.7) # 120
print(num2)

# 불리언 자료(참(True)/거짓(False))
state = True
print(state) # True - 첫글자 대문자로
print(not state) # False - 첫글자 대문자로

print(10 > 11) # False
print(10 < 11) # True
