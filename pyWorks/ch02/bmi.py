# 체질량 지수 = 몸무게 / 키의 제곱
# 키 = 키 / 100 (m 단위기 때문)
name = input("이름을 입력하세요 : ")
weight = float(input("몸무게를 입력해주세요 : "))
height = float(input("키를 입력해주세요 : "))
height = height / 100 # cm로 환산

# 체질량 지수 공식
bmi = weight / (height ** 2)

# print(f'{name}님의 BMI는 {bmi:.2f}입니다.') # f 스트링(string) 방식
# % 포맷 방식: %s - 문자, %f - 실수, %d - 정수
print("%s님의 BMI는 %.2f입니다." % (name, bmi))
# print(name + "님의 BMI는")

if bmi < 20:
    print("저체중입니다.")
elif bmi >= 20 and bmi < 24:
    print("정상입니다.")
elif bmi >= 24 and bmi < 30:
    print("과체중입니다.")
else:
    print("비만입니다.")
# print(f'체질량 지수는 {bmi:.2f}입니다.')
