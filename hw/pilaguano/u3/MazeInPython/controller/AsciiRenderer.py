class AsciiRenderer:
    def __init__(self, maze):
        self.maze = maze

    def print_ascii(self):
        for y in range(self.maze.height):
            # Print top walls
            for x in range(self.maze.width):
                print('+', end='')
                if self.maze.rooms[x][y].walls['N']:
                    print('---', end='')
                else:
                    print('   ', end='')
            print('+')

            # Print side walls
            for x in range(self.maze.width):
                if self.maze.rooms[x][y].walls['W']:
                    print('|', end='')
                else:
                    print(' ', end='')
                print('   ', end='')
            if self.maze.rooms[self.maze.width-1][y].walls['E']:
                print('|')
            else:
                print(' ')

        # Print bottom wall
        for x in range(self.maze.width):
            print('+', end='')
            if self.maze.rooms[x][self.maze.height-1].walls['S']:
                print('---', end='')
            else:
                print('   ', end='')
        print('+')
