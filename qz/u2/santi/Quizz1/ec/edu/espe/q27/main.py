from model.E import E
from model.C import C
from model.A import A
from model.B import B

def main():
    print("Creating E object")
    e = E()
    
    print("Creating C object")
    c = C()
    
    print("Calling e.m2(c)")
    e.m2(c)

    # Código opcional
    print("Creating A object")
    a = A()
    
    print("Creating B objects")
    b1 = B()
    b2 = B()
    
    print("Calling a.m1(b1, b2)")
    a.m1(b1, b2)

if __name__ == "__main__":
    main()
