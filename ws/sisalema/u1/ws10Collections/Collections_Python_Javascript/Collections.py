from Person import Person

class Collections:
    @staticmethod
    def main():
        things = []
        print(f"size at the beginning: {len(things)}")

        person = Person(0, "Yostin")
        things.append(650)
        things.append("Hello OOP 14539, ")
        things.append(3343.27)
        things.append(person)

        print(f"things: {things}")

        things.remove(650)
        print(f"things after removing 650: {things}")

        things.remove(person)
        print(f"things after removing person: {things}")

if __name__ == "__main__":
    Collections.main()