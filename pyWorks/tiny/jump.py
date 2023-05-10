import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description='Jump the Five',
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )

    parser.add_argument('text',
                        metavar='str',
                        help='Input text')

    return parser.parse_args()

def main():
    args = get_args()
    jumper = {
        '0':'5', '1':'9', '2':'8', '3':'7', '4':'6',
        '5':'0', '6':'4', '7':'3', '8':'2', '9':'1'
    }

    # 방법 1
    '''
    for char in args.text:
        print(jumper.get(char, char), end='')
    '''

    # 방법 2
    '''
    new_list = []
    for char in args.text:
        new_list.append(jumper.get(char, char))
    print(''.join(new_list))
    '''

    # 방법 3 - 리스트 내포
    # print(''.join([jumper.get(char, char) for char in args.text]))    # 문자열.join()

    # 방법 4 - 새로운 문자열 만들기
    new_text = ''
    for char in args.text:
        new_text += jumper.get(char, char)
    print(new_text)

if __name__ == '__main__':
    main()