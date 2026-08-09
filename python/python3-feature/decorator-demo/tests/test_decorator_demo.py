import unittest

from src.decorator_demo import calculate


class DecoratorDemoTest(unittest.TestCase):
    def test_decorator_preserves_function_result(self):
        self.assertEqual(5, calculate(2, 3))
        self.assertEqual("calculate", calculate.__name__)


if __name__ == "__main__":
    unittest.main()
