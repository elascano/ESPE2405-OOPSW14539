from .EntranceExitSetter import EntranceExitSetter
from .PathCreator import PathCreator

class MazeGenerator:
    def __init__(self, maze):
        self.maze = maze
        self.path_creator = PathCreator(maze)
        self.entrance_exit_setter = EntranceExitSetter(maze)

    def generate(self):
        self.path_creator.create_path(0, 0)
        self.entrance_exit_setter.set_entrance_and_exit()