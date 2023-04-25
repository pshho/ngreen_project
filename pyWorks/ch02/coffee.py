#

coffee = 5

while True:
    try:
        put = int(input("돈을 넣어주세요: "))
        
        if put == 400:
            coffee -= 1 # coffee = coffee - 1
            print(f'커피가 나옵니다.')
        elif put > 400:
            coffee -= 1
            lm = put - 400
            print(f'커피가 나오고, 거스름돈 {lm}원을 돌려받습니다.')
        elif put < 400:
            print(f'돈이 부족합니다. 다시 {put}원을 받아가주세요.')
        print(f'남은 커피의 양은 {coffee}개 입니다.')

        # 커피가 0개이면 프로그램 종료
        if coffee == 0:
                print(f'커피가 모두 소진되었습니다. 판매를 중지합니다.')
                break
    except:
        # print(f'돈을 정확히 넣어주세요')
        pass
