from model.B import B

class C:
    def __init__(self):
        self.b = B()
        print("C object created with B object:", self.b)
