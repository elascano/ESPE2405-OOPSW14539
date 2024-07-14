import unittest
from math_functions import add_numbers

class TestBasicOperations(unittest.TestCase):

    def test_add_numbers(self):
        addend1 = 6.5
        addend2 = 4.0
        expected = 10.5
        result = add_numbers(addend1, addend2)
        self.assertAlmostEqual(result, expected, places=5)

    def test_add_numbers_negative(self):
        addend1 = -1.5
        addend2 = -2.9
        expected = -4.4
        result = add_numbers(addend1, addend2)
        self.assertAlmostEqual(result, expected, places=5)

    def test_add_numbers_integers(self):
        addend1 = 10
        addend2 = 2
        expected = 12
        result = add_numbers(addend1, addend2)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()
