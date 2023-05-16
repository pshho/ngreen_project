'''
☆ hangman 게임
- 단어의 각 글자 자리에 짧은 선이 그려진다.
- 글자 1개를 맞추면 글자가 표시되고, 추가로 계속 맞추면 글자가 표시됨
- 틀리면 기회가 1번 줄어든다.
- 전체 글자를 입력하여 맞추면 프로그램 바로 종료
'''
import random

words = ['dog', 'cat', 'monkey', 'chicken', 'frog', 'horse']
lives_remaining = 10    # 남은 기회(전역 변수)
guessed_letters = ''    # 추측된 단어

def pick_a_word():
    word = random.choice(words)
    return word

def get_guess(word):
    print_word_with_blanks(word)
    print("Lives Remaining: " + str(lives_remaining))
    guess = input("Guess a letter or whole word? ")
    return guess

def print_word_with_blanks(word):
    display_word = ''   # 게이머가 추측한 글자가 입력될 변수
    for letter in word:
        if guessed_letters.find(letter) > -1:   # 글자를 찾음
            display_word += letter  # 단어를 추가해서 저장
        else:
            display_word += '_'
    print(display_word)

def process_guess(guess, word):
    global lives_remaining, guessed_letters  # 전역 변수화(global)
    lives_remaining -= 1    # 기회가 1줄어듬
    guessed_letters += guess
    if guess == word:
        return True
    else:
        return False

def play():
    word = pick_a_word()
    while True:
        guess = get_guess(word)
        if process_guess(guess, word):  # 추측해서 맞췄을 때
            print("You win! Well done!")
            break
        if lives_remaining == 0:
            print("You are Hung")
            print("The word was: " + word)
            break

    # length = len(word)

play()
# print(lives_remaining)