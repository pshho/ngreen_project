# 객체 리스트
from pyWorks.python.classification.customer.customer import Customer
from pyWorks.python.classification.customer.goldcustomer import GoldCustomer
from pyWorks.python.classification.customer.vipcustomer import VIPCustomer

# Customer - 2명, GoldCustomer - 2명, VIPCustomer - 1명
customer = [
    Customer('놀부'),
    Customer('팥쥐'),
    GoldCustomer('흥부'),
    GoldCustomer('콩쥐'),
    VIPCustomer('심청', 666)
]

print("**** 구매 가격과 보너스 포인트 계산 ****")
for cus in customer:
    price = 10000
    cost = cus.calc_price(price)

    print(cus.getname() + '님의 총 구매 금액은 ' + format(cost, ',d') + '원 입니다.')

print()
print("********* 고객 정보 출력 **********")

# 전체 출력
for cus in customer:
    print(cus)

print()
print("******** 고객 아이디 출력 ********")

for cus in customer:
    print(f'{cus.getname()} 고객님의 아이디 번호는 {cus.getid()}번 입니다.')