import random

class EntranceExitSetter:
    def __init__(self, maze):
        self.maze = maze

    def set_entrance_and_exit(self):
        possible_entrances = [(x, 0) for x in range(self.maze.width)] + \
                             [(x, self.maze.height-1) for x in range(self.maze.width)] + \
                             [(0, y) for y in range(self.maze.height)] + \
                             [(self.maze.width-1, y) for y in range(self.maze.height)]
        
        self.maze.entrance = random.choice(possible_entrances)
        possible_exits = [pos for pos in possible_entrances if pos != self.maze.entrance]
        self.maze.exit = random.choice(possible_exits)

        self._open_entrance_exit(self.maze.entrance)
        self._open_entrance_exit(self.maze.exit)

    def _open_entrance_exit(self, position):
        x, y = position
        if y == 0:
            self.maze.rooms[x][y].walls['N'] = False
        elif y == self.maze.height - 1:
            self.maze.rooms[x][y].walls['S'] = False
        elif x == 0:
            self.maze.rooms[x][y].walls['W'] = False
        else:
            self.maze.rooms[x][y].walls['E'] = False
