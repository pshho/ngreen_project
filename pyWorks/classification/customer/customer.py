# Customer 클래스 생성
# 멤버 변수 - 고객아이디, 이름, 등급, 보너스 포인트, 보너스 적립율
# 멤버 변수에 접근하는 함수 - set(), get()
# 보너스 포인트 = 가격 * 보너스 적립율
class Customer:
    serial_num = 1000

    def __init__(self, name):
        Customer.serial_num += 1
        self.cid = Customer.serial_num
        self.name = name
        self.cgrade = "SILVER"
        self.bonus_point = 0
        self.bonus_ratio = 0.01 # 1%

    def calc_price(self, price):
        # 보너스 포인트 += 보너스 적립율 * 가격
        self.bonus_point += int(self.bonus_ratio * price)

        return price

    def __str__(self):
        return f'{self.name} 고객님의 등급은 {self.cgrade}이며,' \
               f' 잔여 보너스 포인트는 {self.bonus_point}, 적립율은 {self.bonus_ratio:.1%}입니다.'

    def getname(self):  # 이름을 가져오는 함수
        return self.name

    def getid(self):
        return self.cid

if __name__ == '__main__':
    c1 = Customer('정국')
    c2 = Customer('슈가')

    price1 = 10000
    cost1 = c1.calc_price(price1)
    price2 = 20000
    cost2 = c2.calc_price(price2)

    print(c1)
    print(f'{c1.getname()}님의 총 구매 비용은 {cost1}원 입니다.')
    print(c2)
    print(f'{c2.getname()}님의 총 구매 비용은 {cost2}원 입니다.')