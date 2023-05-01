# sys 모듈 - system
# 명령프롬프트(명령 행에서 인수 사용하기)
import sys

'''
# print(sys.argv)
print(sys.argv[1:])
'''

# 입력값 연산
args = sys.argv[1:]  # args 리스트 생성(문자 자료형)
print(args) # args 리스트 출력(문자 자료형)
total = 0

for i in args:
    total += int(i) # 입력받은 문자를 숫자형으로 변환해야 함

print('합계 :', total)