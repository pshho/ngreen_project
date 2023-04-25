# 사각형의 넓이 계산 함수
# 사각형의 넓이 계산 함수 = 가로의 길이 X 세로의 길이
# 삼각형의 넓이 계산 함수 = (밑변 X 높이) / 2
# 함수이름 - calc_area(), tri_area
def calc_area(w, h):
    area = w * h
    return area

def tri_area(w, h):
    area = (w * h) / 2
    return area

# 사각형: 가로 - 4cm, 세로 - 3cm
result = calc_area(3, 4)
print('사각형의 면적 :', result)  # 12
print(f'사각형의 면적: {result}') # 12

# 삼각형: 밑변 - 4cm, 높이 - 5cm
result2 = tri_area(4, 5)
print('삼각형의 면적 : %.0f' % (result2))  # 10
print(f'삼각형의 면적: {result2:.0f}') # 10

# 정사각형의 면적
'''
size = int(input("숫자 입력: "))
area = size * size
print(area)
'''

def calc_size(n):
    area = n * n
    return area

print(calc_size(100))

