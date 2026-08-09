import unittest

from src.generator_demo import countdown


class GeneratorDemoTest(unittest.TestCase):
    def test_generator_is_lazy_and_iterable(self):
        values = countdown(3)
        self.assertEqual([3, 2, 1], list(values))
        self.assertEqual([], list(values))


if __name__ == "__main__":
    unittest.main()
