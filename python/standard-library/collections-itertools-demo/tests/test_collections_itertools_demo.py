import unittest

from src.collections_itertools_demo import take_window, top_tags


class CollectionsItertoolsDemoTest(unittest.TestCase):
    def test_counts_tags(self):
        self.assertEqual(top_tags(["java", "python", "java"]), [("java", 2), ("python", 1)])

    def test_takes_prefix(self):
        self.assertEqual(take_window([1, 2, 3], 2), [1, 2])
