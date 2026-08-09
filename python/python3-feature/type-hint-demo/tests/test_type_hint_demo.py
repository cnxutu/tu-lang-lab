import unittest

from src.type_hint_demo import Result, build_result, identity


class TypeHintDemoTest(unittest.TestCase):
    def test_type_hints_document_generic_boundary(self):
        self.assertEqual(3, identity(3))
        self.assertEqual(Result("k5"), build_result("k5"))


if __name__ == "__main__":
    unittest.main()
