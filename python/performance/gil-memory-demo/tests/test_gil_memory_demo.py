import unittest

from src.gil_memory_demo import cpu_work, reference_count_snapshot, run_two_threads


class GilMemoryDemoTest(unittest.TestCase):
    def test_cpu_work_is_deterministic(self):
        self.assertEqual(cpu_work(4), 14)

    def test_threads_produce_two_results(self):
        self.assertEqual(run_two_threads(4), [14, 14])

    def test_reference_count_is_positive(self):
        self.assertGreater(reference_count_snapshot(object()), 0)
