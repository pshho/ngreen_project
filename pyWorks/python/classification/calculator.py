# Calculator 클래스
class Calculator:
    def __init__(self):
        self.x = 0 # 멤버변수 x에 0을 할당

    # 매개변수 y값을 x값에 더하기
    def add(self, y):
        # self.x = self.x + y
        self.x += y
        return self.x

    # 매개변수 z값을 x값에서 빼기
    def sub(self, z):
        self.x -= z
        return self.x

cal1 = Calculator()
print(cal1.add(10))
print(cal1.sub(4))

cal2 = Calculator()
print(cal2.add(10.1))
print(cal2.sub(2.5))
