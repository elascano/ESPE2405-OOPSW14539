def multiplication_table():
 for num in range(1, 13):
        print(f"Multiplication table of the {num}:")
        for i in range(1, 11):
            result = num * i
            print(f"{num} x {i} = {result}")
        print()

multiplication_table()
print("End of Program")

