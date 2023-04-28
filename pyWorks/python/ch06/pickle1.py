# pickle 모듈
# pickle.dump - 쓰기, pickle.load - 읽기
import pickle

with open('./output/object.txt', 'wb') as f:
    a = ['강아지', '고양이', '말']
    dic = {1 : '강아지', 2 : '고양이', 3 : '말'}
    pickle.dump(a, f)   # 쓰기
    pickle.dump(dic, f)

with open('./output/object.txt', 'rb') as f:
    a = pickle.load(f)  # 읽기
    dic = pickle.load(f)

    print(a)
    print(dic)