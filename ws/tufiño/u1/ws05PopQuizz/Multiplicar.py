
def print_multiplication_table(number):
    for i in range(1, 11):
        print(f"{number} x {i} = {number * i}")


def print_all_tables():
    for number in range(1, 11):
        print(f"\nMultiplication Table for {number}:")
        print_multiplication_table(number)


print_all_tables()
