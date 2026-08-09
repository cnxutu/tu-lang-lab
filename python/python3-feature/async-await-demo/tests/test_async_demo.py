import asyncio
import unittest

from src.async_demo import collect


class AsyncDemoTest(unittest.TestCase):
    def test_gathers_coroutines(self):
        self.assertEqual(["profile", "alerts"], asyncio.run(collect()))


if __name__ == "__main__":
    unittest.main()
