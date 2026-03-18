import sys

path = sys.argv[1] if len(sys.argv) > 1 else "input.csv"
with open(path) as f:
    for line in f:
        print(line, end="")
