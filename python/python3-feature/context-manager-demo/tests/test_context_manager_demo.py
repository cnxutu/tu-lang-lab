import unittest

from src.context_manager_demo import run


class ContextManagerDemoTest(unittest.TestCase):
    def test_cleanup_runs_after_scope(self):
        self.assertEqual(["open", "work", "close"], run())


if __name__ == "__main__":
    unittest.main()
