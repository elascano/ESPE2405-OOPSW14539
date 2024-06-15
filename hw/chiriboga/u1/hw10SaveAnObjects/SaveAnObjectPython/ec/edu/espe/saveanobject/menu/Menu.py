from utils import SerializeUtil

def showMenu():
    while True:
        print("Menu:")
        print("1. Create Computer")
        print("2. Read Computer")
        print("3. Exit")

        try:
            operation = int(input("Enter the option: "))
        except ValueError:
            print("Invalid operation.")
            continue

        if operation == 1:
            SerializeUtil.create(input)
        elif operation == 2:
            SerializeUtil.read(input)
        elif operation == 3:
            print("Exiting...")
            break
        else:
            print("Invalid operation.")

if __name__ == "__main__":
    showMenu()
