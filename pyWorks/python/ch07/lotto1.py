# 로또 복권 추첨 프로그램
# 1 ~ 45까지 6개 랜덤수로 저장
import random

# 빈 리스트 생성
lotto = []

# 처리
while len(lotto) < 6:
    num = random.randint(1, 45)

    if num not in lotto:
        lotto.append(num)

# 출력
print(lotto)