import unittest

from controller.calculations import Calculator
class TestCalculator(unittest.TestCase):
    def setUp(self):
        self.calculator = Calculator()

    def test_calculate_monthly_salary(self):

        self.assertEqual(self.calculator.calculate_monthly_salary(120000), 10000)

        self.assertEqual(self.calculator.calculate_monthly_salary(60000), 5000)

        self.assertEqual(self.calculator.calculate_monthly_salary(0), 0)

        self.assertEqual(self.calculator.calculate_monthly_salary(-120000), -10000)

        self.assertAlmostEqual(self.calculator.calculate_monthly_salary(1), 0.0833, places=4)

        self.assertEqual(self.calculator.calculate_monthly_salary(1e6), 83333.3333)

        self.assertEqual(self.calculator.calculate_monthly_salary(120000.75), 10000.0625)

        self.assertEqual(self.calculator.calculate_monthly_salary(123456.78), 10288.065)

        with self.assertRaises(TypeError):
            self.calculator.calculate_monthly_salary("120000")

        with self.assertRaises(TypeError):
            self.calculator.calculate_monthly_salary(None)


if __name__ == "__main__":
    unittest.main()