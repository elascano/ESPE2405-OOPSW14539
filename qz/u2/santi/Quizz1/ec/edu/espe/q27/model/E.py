from model.A import A
from model.B import B

class E:
    def __init__(self):
        self.a = A()
        self.b = [B() for _ in range(10)]
        print("E object created with 10 B objects")

    def m2(self, z):
        """
        Este método permite usar un objeto de tipo C y no retorna nada.
        :param z: objeto de tipo C
        """
        print(f"m2() called with C object: {z}")
