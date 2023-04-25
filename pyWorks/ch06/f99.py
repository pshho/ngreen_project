# 구구단 쓰기
# with ~ as 구문에서 close() 함수(f.close()) 사용 X
try:
    with open("./output/gugu.txt", "w") as f:
        for i in range(2, 10):
            for j in range(1, 10):
                gugudan = f'{i} X {j} = {i * j}\n'
                f.write(gugudan)
            f.write('\n')
except FileNotFoundError:
    print("파일을 작성할 수 없습니다.")

# 구구단 파일 읽기
try:
    with open("./output/gugu.txt", "r") as f:
        gugudan = f.read()
        print(gugudan)
except FileNotFoundError:
    print("파일을 찾을 수 없습니다.")