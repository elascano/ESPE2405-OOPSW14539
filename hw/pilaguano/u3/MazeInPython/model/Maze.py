from model.Room import Room

class Maze:
    def __init__(self, width, height):
        self.width = width
        self.height = height
        self.rooms = [[Room(x, y) for y in range(height)] for x in range(width)]
        self.entrance = None
        self.exit = None