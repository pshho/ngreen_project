# 입력 받아 파일 쓰기
# 'a' 모드 - 추가 저장 가능함
# 'w' 모드 - 한번 작성한 리스트를 지우고 다시 쓰면 이전 내용은 초기화되고 다시 쓴 내용만 저장
with open("./output/input.txt", 'a') as f:
    while True:
        text = input("저장할 내용을 입력해 주세요(종료 -z) : ")

        if text == 'z':
            break

        f.write(text)
        f.write('\n')