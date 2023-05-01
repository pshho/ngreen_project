# f = open() → with open()
# 파일 입출력 - .txt → 문자형 데이터만 저장(나머지 자료형은 변환 필요)
'''
f = open('./output/string.txt', 'w')

f.write('여름이 운다\n')
f.write('123\n')

val = (12 * 1000) / 5
f.write(str(val))

f.close()
'''

# kbo팀 파일에 기록
team = ['키움', '삼성', '롯데', '두산', 'KIA', 'SSG', 'LG', 'NC', '한화', 'KT']

try:
    with open('./output/kbo2023.txt', 'w') as f:
        for i in team:
            # team의 마지막 요소를 쉼표 생략
            if team[-1] == i:
                f.write(i)
            else:
                f.write(i + ', ')
except FileNotFoundError as e:
    print(e)
    print('파일을 작성할 수 없습니다.')

# kbo2023.txt 읽기
try:
    with open('./output/kbo2023.txt', 'r') as f:
        team = f.read()
        print(team)
except FileNotFoundError as e:
    print(e)
    print('파일을 읽을 수 없습니다.')