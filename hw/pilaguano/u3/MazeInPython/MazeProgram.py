import sys
from controller.MazeGenerator import MazeGenerator
from controller.MazeRenderer import MazeRenderer
from model.Maze import Maze

class MazeProgram:
    def __init__(self):
        self.width = int(input("Introduce the N: ")) 
        self.height = int(input("Introduce the M: "))
        print(f"Size of the maze {self.width}x{self.height}")

    def run(self):
        # Crear y generar el laberinto
        maze = Maze(self.width, self.height)
        generator = MazeGenerator(maze)
        generator.generate()

        # Preguntar al usuario el tipo de representación
        typeOfMaze = int(input("Would you like ASCII=1 mode or Image=2? "))

        # Crear una instancia de MazeRenderer
        renderer = MazeRenderer(maze)

        if typeOfMaze == 1:
            renderer.print_ascii()
            print("ASCII representation printed above.")
        elif typeOfMaze == 2:
            image = renderer.draw_image()
            image.save('maze.png')
            print("Image saved as 'maze.png'.")
        else:
            print("Invalid option selected.")

if __name__ == "__main__":
    program = MazeProgram()
    program.run()


#print(f"Maze generated with dimensions: {self.width}x{self.height}")