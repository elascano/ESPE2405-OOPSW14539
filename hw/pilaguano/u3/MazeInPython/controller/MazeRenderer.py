from .AsciiRenderer import AsciiRenderer  
from .ImageRenderer import ImageRenderer


class MazeRenderer:
    def __init__(self, maze):
        self.maze = maze
        self.ascii_renderer = AsciiRenderer(maze)
        self.image_renderer = ImageRenderer(maze)

    def print_ascii(self):
        self.ascii_renderer.print_ascii()

    def draw_image(self, cell_size=20):
        self.image_renderer.cell_size = cell_size  # Update cell size if necessary
        return self.image_renderer.draw_image()
