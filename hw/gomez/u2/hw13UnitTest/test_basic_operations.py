import unittest
from basic_operations import add_numbers

class TestBasicOperations(unittest.TestCase):

    def test_add_numbers(self):
        addend1 = 1.2
        addend2 = 3.6
        expected = 4.8
        result = add_numbers(addend1, addend2)
        self.assertAlmostEqual(result, expected, places=5)

    def test_add_numbers_negative(self):
        addend1 = -1.8
        addend2 = -2.2
        expected = -4.0
        result = add_numbers(addend1, addend2)
        self.assertAlmostEqual(result, expected, places=5)

    def test_add_numbers_integers(self):
        addend1 = 1
        addend2 = 2
        expected = 3
        result = add_numbers(addend1, addend2)
        self.assertEqual(result, expected)

    def test_add_numbers_with_error(self):
        addend1 = 3.2
        addend2 = 4.3
        # Cambiar la expectativa a un valor incorrecto para forzar un fallo
        expected = 7.0  # Cambié esto a un valor que sabemos que es incorrecto
        result = add_numbers(addend1, addend2)
        self.assertAlmostEqual(result, expected, places=5)

if __name__ == '__main__':
    unittest.main()