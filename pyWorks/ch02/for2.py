# for ~ in
'''
languages = ['Python', 'C', 'Java', 'Javascript']

for lang in languages:
    if lang in ['Python', 'Javascript']:
        # pass # 작업하다 잠깐 남겨놓을 때(일시중지) - 오류 인식 X
        print(f'{lang} need interpreter') # 인터프리터
    else:
        print(f'{lang} need complier') # 컴파일러
'''

# 구구단 출력
dan = 4
result = ""

'''
for i in range(1, 10):
    print(f'{dan} X {i} = {dan * i}')
'''

for i in range(1, 10):
    current_val = f'{dan} X {i} = {dan * i}\n'
    result += current_val
print(result)
