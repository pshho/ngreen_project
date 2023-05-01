# GoldCustomer 클래스 생성
# 멤버 변수 - 고객아이디, 이름, 고객등급, 구매할인율, 보너스 적립율
import pyWorks.python.classification.customer.customer

from pyWorks.python.classification.customer.customer import Customer

class GoldCustomer(Customer):
    def __init__(self, name):
        super().__init__(name)
        self.cgrade = 'GOLD'
        self.sale_ratio = 0.1   # 10%
        self.bonus_ratio = 0.02 # 2%

    def calc_price(self, price):
        # price = price * sale_ratio(가격 = 가격 * 구매할인율)
        # 할인된 가격 = 원래 가격 - (원래 가격 * 구매할인율)
        price -= int(price * self.sale_ratio)
        self.bonus_point += int(price * self.bonus_ratio)

        return price

if __name__ == '__main__':
    g1 = GoldCustomer('뷔')
    price1 = 10000
    cost1 = g1.calc_price(price1)

    print(g1)
    print(f'{g1.getname()}님의 총 구매 비용은 {cost1}원 입니다.')