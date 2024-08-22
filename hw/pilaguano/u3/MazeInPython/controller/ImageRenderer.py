from PIL import Image, ImageDraw

class ImageRenderer:
    def __init__(self, maze, cell_size=20):
        self.maze = maze
        self.cell_size = cell_size

    def draw_image(self):
        img_width = self.maze.width * self.cell_size
        img_height = self.maze.height * self.cell_size
        image = Image.new('RGB', (img_width, img_height), color='white')
        draw = ImageDraw.Draw(image)

        for y in range(self.maze.height):
            for x in range(self.maze.width):
                if self.maze.rooms[x][y].walls['N']:
                    draw.line([(x*self.cell_size, y*self.cell_size), ((x+1)*self.cell_size, y*self.cell_size)], fill='black')
                if self.maze.rooms[x][y].walls['S']:
                    draw.line([(x*self.cell_size, (y+1)*self.cell_size), ((x+1)*self.cell_size, (y+1)*self.cell_size)], fill='black')
                if self.maze.rooms[x][y].walls['W']:
                    draw.line([(x*self.cell_size, y*self.cell_size), (x*self.cell_size, (y+1)*self.cell_size)], fill='black')
                if self.maze.rooms[x][y].walls['E']:
                    draw.line([((x+1)*self.cell_size, y*self.cell_size), ((x+1)*self.cell_size, (y+1)*self.cell_size)], fill='black')

        # Mark entrance and exit
        ex, ey = self.maze.entrance
        draw.rectangle([ex*self.cell_size, ey*self.cell_size, (ex+1)*self.cell_size, (ey+1)*self.cell_size], fill='green')
        ex, ey = self.maze.exit
        draw.rectangle([ex*self.cell_size, ey*self.cell_size, (ex+1)*self.cell_size, (ey+1)*self.cell_size], fill='red')

        return image
