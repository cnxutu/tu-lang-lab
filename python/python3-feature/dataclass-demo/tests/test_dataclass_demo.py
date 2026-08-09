import unittest

from src.dataclass_demo import Coordinate, midpoint


class DataclassDemoTest(unittest.TestCase):
    def test_value_object_equality_and_immutability(self):
        self.assertEqual(Coordinate(1, 2), Coordinate(1, 2))
        with self.assertRaises(AttributeError):
            Coordinate(1, 2).x = 3
        self.assertEqual(Coordinate(1, 2), midpoint(Coordinate(0, 0), Coordinate(2, 4)))


if __name__ == "__main__":
    unittest.main()
