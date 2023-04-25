# 나이가 100세 되는 해의 연도 계산하기
# 현재 연도 +
import datetime
import calendar as cal

today = datetime.date.today()

cal.prcal(2023)
cal.prmonth(2021, 4)

# print(today.year)

age = input("현재 나이를 입력하세요: ")
furture = today.year + (100 - int(age))

print(f'100세가 되는 해는 {furture}년 입니다.')