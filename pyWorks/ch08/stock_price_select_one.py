# 주식 종목 가져오기(네이버 금융 → 증권 → 증권홈 → 우측 하단(인기 종목 검색))
import requests
from bs4 import BeautifulSoup

def getcontent(item_code):
    url = 'https://finance.naver.com/item/main.naver?code=' + item_code
    response = requests.get(url)
    content = BeautifulSoup(response.text, 'html.parser')
    return content

def getprice(item_code):
    content = getcontent(item_code)  # 호출
    today = content.select_one('div.today')
    price = today.select_one('span.blind')

    title = content.select_one('div.wrap_company')
    text = title.select_one('a')

    return text.string, price.text

에코프로 = getprice('086520')
삼성전자 = getprice('005930')
네이버 = getprice('035420')

주식정보 = getprice('302440')

print(f'{에코프로[0]} 주가 : {에코프로[1]}원')
print(f'{삼성전자[0]} 주가 : {삼성전자[1]}원')
print(f'{네이버[0]} 주가 : {네이버[1]}원')
print(f'{주식정보[0]} 주가 : {주식정보[1]}원')