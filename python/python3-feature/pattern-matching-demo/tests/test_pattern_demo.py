import unittest

from src.pattern_demo import describe


class PatternDemoTest(unittest.TestCase):
    def test_matches_mapping_sequence_and_none(self):
        self.assertEqual("user:Ada", describe({"kind": "user", "name": "Ada"}))
        self.assertEqual("list:1:2", describe([1, 2, 3]))
        self.assertEqual("empty", describe(None))


if __name__ == "__main__":
    unittest.main()
