# 사번 자동 발급
# 보안 - 멤버 변수에 직접 접근하지 않고, 함수 작성
class Employee:
    serial_num = 1000   # 사번 기준값(클래스 변수)

    def __init__(self, name):
        # 사번 기준값을 1증가 후 id에 저장
        Employee.serial_num += 1
        self.id = Employee.serial_num
        self.name = name

    def __str__(self):
        return '사번 : {0}, 이름 : {1}'.format(self.id, self.name)

emp1 = Employee('김산')
emp2 = Employee('유사원')
emp3 = Employee('권사원')

'''
print(emp1.id, emp1.name)
print(emp2.id, emp2.name)
print(emp3.id, emp3.name)
'''

print(emp1)
print(emp2)
print(emp3)

# 객체 리스트
employee = [
    Employee('구름'),
    Employee('별'),
    Employee('행성'),
    Employee('달')
]

# 객체 리스트 전체 출력
for emp in employee:
    print(emp)