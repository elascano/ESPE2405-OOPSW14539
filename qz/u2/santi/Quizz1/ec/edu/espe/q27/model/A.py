class A:
    def __init__(self):
        self.b1 = None
        self.b2 = None

    def m1(self, x, y):
        """
        Este método usa dos objetos de tipo B.
        :param x: objeto de tipo B
        :param y: objeto de tipo B
        """
        self.b1 = x
        self.b2 = y
        print(f"m1() called with B objects: {x} and {y}")
