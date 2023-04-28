# 영어 타자 게임
# 단어창 읽어오기
import random, time

try:
    with open("./output/word.txt", "r") as f:
        data = f.read().split()
        # print(word)

    n = 1   # 문제 번호
    input("[타자 게임] 준비되면 엔터")
    start = time.time()
    while n <= 10:
        question = random.choice(data)
        print(f'문제 {n}')
        print(question)
        user = input()

        if user == question:
            print("정답입니다.")
            n += 1
        else:
            print("틀렸습니다. 다시 도전!")

    end = time.time()
    print(f"게임 소요 시간: {end-start:.2f}")
except FileNotFoundError:
    print("파일을 실행할 수 없습니다.")

