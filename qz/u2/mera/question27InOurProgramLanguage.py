class B:
    def __init__(self, value):
        self.value = value

class A:
    def __init__(self, b1: B, b2: B):
        self.b1 = b1
        self.b2 = b2

    def m1(self, x: B, y: B):
        return x.value + y.value

class C:
    def __init__(self, b: B):
        self.b = b

class E:
    def __init__(self, a: A, b: list):
        if len(b) != 10:
            raise ValueError("La lista b debe contener 10 elementos de tipo B")
        self.a = a
        self.b = b

    def m2(self, z: C):
        total = z.b.value
        for b_element in self.b:
            total += b_element.value
        return total
