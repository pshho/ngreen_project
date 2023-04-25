# Student
# class(클래스)도 로컬
# 클래스 생성 함수: def __init__()
class Student:
    # 생성자 함수(멤버 함수)
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

    '''
    def info(self):
        print(f'이름 : {self.name}, 학년 : {self.grade}')
    '''

    def __str__(self): # 멤버정보출력(문자형) 파이썬 내장 함수
        return f'이름 : {self.name}, 학년 : {self.grade}'

    def learn(self):
        print('수업을 듣습니다.')

# 메인영역
if __name__ == '__main__':
    s1 = Student('김하나', 1)
    print(s1)
    s1.learn()

    s2 = Student('박성호', 3)
    print(s2)
    s2.learn()