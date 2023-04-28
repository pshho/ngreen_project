# import 모듈이름
import student2
# from 모듈이름 import 클래스이름
from student2 import Student

# 파일이름.클래스 이름
'''
st1 = Student('이셋', 3)
st1.info()
st1.learn()
'''

# 객체 리스트 생성
student = [
    Student('김하나', 1),
    Student('박둘', 2),
    Student('이셋', 3)
]

# 특정한 학생 조회
'''
student[0].info()
student[1].info()
'''

'''
print(student[0])
print(student[1])
'''

# 전체조회
for i in student:
    print(i)