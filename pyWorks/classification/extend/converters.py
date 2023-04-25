# ScaleConverter 상속받는 클래스
# 화씨온도(F) = 섭씨온도(C) X 1.8 + 32
# import 패키지이름.모듈이름
# from 패키지이름.모듈이름 import 클래스
import pyWorks.classification.scale_converter
from pyWorks.classification.scale_converter import ScaleConverter

class Converter(ScaleConverter):
    def __init__(self, units_from, units_to, factor, offset):
        super().__init__(units_from, units_to, factor)
        self.offset = offset

    def convert(self, value):
        # return self.factor * value + self.offset
        return super().convert(value) + self.offset

conv = Converter('C', 'F', 1.8, 32)
print("Converting 21C")
print(f'{conv.convert(21):.2f}{conv.units_to}')

'''
con = ScaleConverter('KB', 'B', 1024)
print("Converting 1 KB")
print(con.convert(1) + con.units_to)
'''