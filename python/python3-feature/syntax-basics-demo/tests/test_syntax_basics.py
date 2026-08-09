import unittest

from src.syntax_basics import summarize_user


class SyntaxBasicsTest(unittest.TestCase):
    def test_collects_positional_and_keyword_arguments(self):
        self.assertEqual(
            {"name": "Ada", "tags": ["language"], "attributes": {"level": "beginner"}},
            summarize_user("Ada", "language", level="beginner"),
        )


if __name__ == "__main__":
    unittest.main()
