# 지나온 날짜 계산하기: 종료일(오늘) - 시작일(과거) = 일수
# datetime.date(종료일) - datetime.date(시작일)
# datetime.date(특정일).weekday(): 요일(인덱스) - 월요일이 0번
import datetime
import calendar as cal

print('♠ 지금까지 몇 일? ♠')
day1 = datetime.date(2023, 3, 16)
print(day1)

# today = datetime.date(2023, 4, 21)
today = datetime.date.today()
print(today)

passed_time = today - day1

# print(passed_time)
print('개강 이후 {}일이 지났습니다.'.format(passed_time.days))

# 날짜로 요일 알아내기
days = ['월', '화', '수', '목', '금', '토', '일']

# weekday() - 요일 나타내는 함수
the_day = datetime.datetime(2023, 3, 16).weekday()

# print(the_day)
print(f'{days[the_day]}요일')

now = today.weekday()

# print(now)
print(f'{days[now]}요일')

# 2023. 3월 출력
cal.prcal(2023)
cal.prmonth(2023, 3)
