# 배송비 계산
# 주문 상품 가격이 2만원 미만이면 배송비 부가(2500원)
# 아니면 배송비 무료
'''
unit_price = input('주문 상품 가격을 입력하세요: ')
num = input('상품 개수를 입력해주세요: ')
def get_price(unit_price, num):
    delivery_fee = 2500  # 배송비
    price = int(unit_price) * int(num)

    if int(unit_price) < 20000:
        price += delivery_fee
        return price
    else:
        return price

order = get_price(unit_price, num)

print(f'결제 금액은 {order}입니다.')
'''