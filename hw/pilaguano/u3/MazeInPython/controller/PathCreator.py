import random

class PathCreator:
    def __init__(self, maze):
        self.maze = maze

    def create_path(self, x, y):
        self.maze.rooms[x][y].visited = True
        while True:
            unvisited = []
            if x > 0 and not self.maze.rooms[x-1][y].visited:
                unvisited.append((x-1, y, 'W', 'E'))
            if x < self.maze.width-1 and not self.maze.rooms[x+1][y].visited:
                unvisited.append((x+1, y, 'E', 'W'))
            if y > 0 and not self.maze.rooms[x][y-1].visited:
                unvisited.append((x, y-1, 'N', 'S'))
            if y < self.maze.height-1 and not self.maze.rooms[x][y+1].visited:
                unvisited.append((x, y+1, 'S', 'N'))

            if not unvisited:
                break

            nx, ny, d1, d2 = random.choice(unvisited)
            self.maze.rooms[x][y].walls[d1] = False
            self.maze.rooms[nx][ny].walls[d2] = False
            self.create_path(nx, ny)
