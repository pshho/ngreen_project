# 영어 단어장 만들기
import random

try:
    word = [
        'ant', 'bear', 'chicken', 'deer', 'fox',
        'elephant', 'horse', 'lion', 'monkey', 'penguin'
    ]

    with open("./output/word.txt", "w") as f:
        for i in word:
            f.write(i + ' ')
            if i == word[-1]:
                f.write(i)
except FileNotFoundError:
    print("파일을 작성할 수 없습니다.")

try:
    with open("./output/word.txt", "r") as f:
        data = f.read().split(' ')  # 공백문자로 구분 - 리스트로 변환
        word = random.choice(data)  # 단어 1개 랜덤 추출
        print(word)
except FileNotFoundError:
    print("파일을 읽어올 수 없습니다.")