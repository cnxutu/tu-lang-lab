import tempfile
import unittest
from pathlib import Path

from src.pathlib_json_demo import round_trip


class PathlibJsonDemoTest(unittest.TestCase):
    def test_round_trip_uses_explicit_utf8(self):
        with tempfile.TemporaryDirectory() as directory:
            path = Path(directory) / "sample.json"
            payload = {"语言": "Python", "version": 3}
            self.assertEqual(payload, round_trip(path, payload))


if __name__ == "__main__":
    unittest.main()
