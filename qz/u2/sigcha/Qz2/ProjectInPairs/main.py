import sys
import os

print("Agregando la ruta actual al PYTHONPATH")
sys.path.append(os.path.dirname(os.path.abspath(__file__)))

print("Intentando importar main_menu desde view.user_interface")
from view.user_interface import main_menu
print("main_menu importado con éxito")

if __name__ == "__main__":
    main_menu()
