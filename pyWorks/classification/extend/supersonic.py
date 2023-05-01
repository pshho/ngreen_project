# SuperSonicAirplane 클래스 생성
from pyWorks.python.classification.airplane import Airplane

# Airplane 상속받음
class SuperSonicAirplane(Airplane):
    # 1번 - NORMAL, 2번 - SUPERSONIC
    NORMAL = 1  # 상수 설정
    SUPERSONIC = 2  # 상수 설정

    # 모드 - 멤버변수
    def __init__(self):
        self.fly_mode = SuperSonicAirplane.NORMAL

    def fly(self):
        if self.fly_mode == SuperSonicAirplane.SUPERSONIC:
            print("초음속으로 비행합니다.")
        else:
            super().fly()

sa = SuperSonicAirplane()
sa.take_off()
sa.fly()
sa.fly_mode = SuperSonicAirplane.SUPERSONIC
sa.fly()
sa.fly_mode = SuperSonicAirplane.NORMAL
sa.fly()
sa.land()