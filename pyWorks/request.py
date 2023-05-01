# 쇼핑 주문, 할인, 배송비
a = {
    '선풍기': 90000, '튜브': 30000, '서핑보드': 65000, '나이키': 120000,
    '수박': 20000, '양말': 1200, '수영복': 40000, '팔토시': 13000,
    '에어컨': 1600000, '돼지고기': 10500, '소고기': 97000, '물안경': 2300
}
e = []
s1 = 0
s2 = 0

print('아래는 상품 목록입니다.')
for key, val in a.items():
    print(f'{key}: {val}')

b = input('몇 종류의 상품을 원하시나요?(상품의 종류 개수): ')

def calc():
    global s2
    for i in range(0, int(b)):
        c = input('{}번째로 원하시는 상품을 입력해주세요: '.format(i+1))
        d = input(f"'{c}' 상품을 몇 개를 원하시나요?: ")

        s1 = int(a[c]) * int(d)
        e.append(s1)
        s2 += e[i]

    return s2

calc()

print()
def pull():
    global s2
    fee = 2500
    if s2 > 200000:
        s2 /= 0.1
        str1 = print(f'고객님의 총 결제 금액은 {s2:.0f}원입니다.')

        return s2, str1
    elif s2 < 50000:
        s2 += fee
        str2 = print(f'고객님의 총 결제 금액은 배송비(2500원) 포함 {s2}원입니다.')

        return s2, str2
    else:
        str3 = print(f'고객님의 총 결제 금액은 {s2}원입니다.')

        return s2, str3

pull()

print('OO 쇼핑몰을 이용해주셔서 감사합니다.')

'''
a = input('몇 종류의 상품을 원하시나요?(상품의 종류 개수): ')
b = []
c = []
d = []
s1 = 0
s2 = 0
s3 = 0
fee = 2500

def get():
    global b, c
    for i in range(0, int(a)):
        b.append(int(input(f'{i+1}번째 상품의 가격을 입력해주세요: ')))
        c.append(int(input(f'{i+1}번째 상품의 주문 개수를 입력해주세요: ')))

    return b, c

get()

def calc():
    global d, s1, s2
    for i in range(0, int(a)):
        s1 = b[i] * c[i]
        d.append(s1)

    for j in d:
        s2 += j

    return s2

calc()

def pull():
    global s2, s3, fee

    if s2 > 100000:
        s3 = s2 * 0.1

        return s2, s3
    elif s2 < 30000:
        s2 += fee

        return s2, fee
    else:
        return s2, s3

pull()

print()
print(f'고객님의 배송비는 {fee}원입니다.')
print(f'할인 금액은 {s3:.0f}원입니다.')
print(f'고객님의 총 결제 금액은 {s2}원입니다.')
'''