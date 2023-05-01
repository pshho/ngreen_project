# VIPCustomer 클래스 - Customer 상속
from pyWorks.python.classification.customer.customer import Customer

class VIPCustomer(Customer):
    def __init__(self, name, agent):
        super().__init__(name)
        self.cgrade = 'VIP'
        self.sale_ratio = 0.1   # 10%
        self.bonus_ratio = 0.05 # 5%
        self.agent = agent

    def __str__(self):
        return f'{super().__str__()}\n{self.name} 고객님의 전문 상담원 ID는 {self.agent} 입니다. '

    def calc_price(self, price):
        price -= int(price * self.sale_ratio)
        self.bonus_point += int(price * self.bonus_ratio)

        return price

if __name__ == '__main__':
    vip = VIPCustomer('진', 777)
    price1 = 10000
    cost1 = vip.calc_price(price1)

    print(vip)
    print(f'{vip.getname()}님의 총 구매 비용은 {cost1}원 입니다.')
