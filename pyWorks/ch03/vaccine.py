try:
    birthyear = input("출생연도를 입력해주세요: ")
    nowyear = 2023
    age = nowyear - int(birthyear)
    check = int(birthyear[-1])
    day = ['월요일 접종', '화요일 접종', '수요일 접종', '목요일 접종', '금요일 접종']

    # print(check)

    if age < 65 and age >= 20:
        print(f'{age}세')
        print('백신 접종 대상')
        if check == 1 or check == 6:
            print(day[0])
        elif check == 7 or check == 2:
            print(day[1])
        elif check == 3 or check == 8:
            print(day[2])
        elif check == 4 or check == 9:
            print(day[3])
        elif check == 5 or check == 0:
            print(day[4])
    else:
        print('백신 접종 미대상')
        print('하반기 일정을 확인해주세요')
except:
    print('출생연도를 정확히 입력해주세요')
