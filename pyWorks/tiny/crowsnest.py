import argparse

def get_args():
    parser = argparse.ArgumentParser(
        description="Crow's nest -- Choose the correct article",
        formatter_class=argparse.ArgumentDefaultsHelpFormatter
    )

    # 명령행 인수: -n(축약형), --name
    parser.add_argument('word',
                        metavar='word',
                        help='A word')

    return parser.parse_args()

def main():
    args = get_args()
    word = args.word
    # print(args.word)
    article = 'an' if word[0].lower() in 'aeiou' else 'a'

    print(f'Ahoy, Captain. {article} {word} off the larboard bow!')

if __name__ == '__main__':
    main()