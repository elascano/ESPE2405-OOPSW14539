class B:
    def __init__(self):
        pass  

class C:
    def __init__(self, b):
        self.b = b

class A:
    def __init__(self, b1, b2):
        self.b1 = b1
        self.b2 = b2
    
    def m1(self, x, y):
        print(f"Executing method m1 with x={x.b} and y={y.b}")

class E:
    def __init__(self, a, b, z):
        self.a = a
        self.b = b
        self.z = z
    
    def m2(self, z):
        print(f"Executing method m2 with z.b={z.b}")

class POOExam1P2027:
    def __init__(self):
        pass

    def main(self):
        obj_b1 = B(10)  
        
        obj_b2 = B(12)  
        
        obj_c = C(obj_b1)
        
        obj_a = A(obj_b1, obj_b2)
        
        obj_e = E(obj_a, obj_b1, obj_c)
        
        obj_a.m1(obj_b1, obj_b2)
        
        obj_e.m2(obj_c)


if __name__ == "__main__":
    proyecto = POOExam1P2027()
    proyecto.main()
