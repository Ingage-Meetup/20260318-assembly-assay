import os
import unittest

from main import sort_chars

INPUT_CSV = os.path.join(os.path.dirname(__file__), "..", "..", "input.csv")
EXPECTED_CSV = os.path.join(os.path.dirname(__file__), "..", "..", "expected-output.csv")


def _read_lines(path):
    with open(path) as f:
        return [line.rstrip("\n") for line in f if line.strip()]


class TestSortChars(unittest.TestCase):
    def setUp(self):
        self.input_lines = _read_lines(INPUT_CSV)
        self.expected_lines = _read_lines(EXPECTED_CSV)

    def test_line_count(self):
        self.assertEqual(len(self.input_lines), len(self.expected_lines))

    def test_sort_chars(self):
        for inp, expected in zip(self.input_lines, self.expected_lines):
            with self.subTest(input=inp):
                self.assertEqual(sort_chars(inp), expected)


if __name__ == "__main__":
    unittest.main()
