import json

class Notebook:
    def __init__(self, id, title, content, tags):
        self.id = id
        self.title = title
        self.content = content
        self.tags = tags

    def to_dict(self):
        return {
            'id': self.id,
            'title': self.title,
            'content': self.content,
            'tags': self.tags
        }

    @staticmethod
    def from_dict(data):
        return Notebook(data['id'], data['title'], data['content'], data['tags'])
def save_to_json(file_name, notebook_list):
    with open(file_name, 'w') as f:
        json.dump([notebook.to_dict() for notebook in notebook_list], f, indent=4)

def load_from_json(file_name):
    try:
        with open(file_name, 'r') as f:
            return [Notebook.from_dict(item) for item in json.load(f)]
    except FileNotFoundError:
        return []

def get_notebook_from_user():
    id = input("Enter ID: ")
    title = input("Enter Title: ")
    content = input("Enter Content: ")
    tags = input("Enter Tags (comma separated): ").split(',')
    return Notebook(id, title, content, tags)
def main():
    file_name = 'notebooks.json'
    notebooks = load_from_json(file_name)
    
    while True:
        print("Add a new notebook")
        print("2. View all notebooks")
        print("3. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            notebook = get_notebook_from_user()
            notebooks.append(notebook)
            save_to_json(file_name, notebooks)
        elif choice == '2':
            for notebook in notebooks:
                print(f"ID: {notebook.id}, Title: {notebook.title}, Content: {notebook.content}, Tags: {', '.join(notebook.tags)}")
        elif choice == '3':
            break
        else:
            print("Invalid choice, please try again")

if __name__ == "__main__":
    main()
