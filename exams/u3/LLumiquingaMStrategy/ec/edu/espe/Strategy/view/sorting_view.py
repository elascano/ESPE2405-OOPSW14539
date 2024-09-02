class SortingView:
    def get_numbers_from_user(self):
        try:
            size = int(input("Ingrese la cantidad de números a ordenar: "))
            numbers = []
            for i in range(size):
                num = int(input(f"Ingrese el número {i+1}: "))
                numbers.append(num)
            return numbers
        except ValueError:
            print("Entrada no válida, por favor ingrese números enteros.")
            return self.get_numbers_from_user()
