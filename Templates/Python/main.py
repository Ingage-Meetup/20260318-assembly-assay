import sys


def sort_chars(line):
    # TODO: implement
    pass


if __name__ == "__main__":
    path = sys.argv[1] if len(sys.argv) > 1 else "input.csv"
    with open(path) as f:
        for line in f:
            print(line, end="")
