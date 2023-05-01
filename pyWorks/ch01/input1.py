# 입력처리 - input()함수
# 입력방법1
'''
print("이름을 입력해주세요")
name = input() # 문자를 입력할 수 있음
print(name + "님 환영해요!!")
'''

# 입력방법2
'''
name = input("이름을 입력해주세요\n")
print(name)
'''
# 입력받는 수는 실제 문자 → 정수로 변환 int()
'''
number = int(input("숫자를 입력하세요(1~10)\n"))
print(number * 2)
'''

# 두 수를 입력받아 합을 계산하기
'''
x = int(input("첫번째 수 입력 : "))
y = int(input("두번째 수 입력 : "))
sum_v = x + y

print(sum_v)
'''

# 나이 계산 프로그램
# 나이 = 현재연도 - 출생연도 + 1
'''
current_year = 2023
birth_year = input("태어난 연도를 입력해 주세요\n")
age = str(current_year - int(birth_year) + 1)


print(birth_year + "년에 태어난 당신의 나이는 "
      + age + "세 입니다")
'''

# 사각형의 넓이를 계산하는 프로그램 작성
width = input("가로의 길이를 입력하세요\n")
height = input("세로의 길이를 입력하세요\n")
area = str(int(width) * int(height))

print("가로의 길이: " + width + "cm")
print("세로의 길이: " + height + "cm")
print("면적: " + area + "cm")
