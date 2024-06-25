class Person:
    def __init__(self, id, name):
        self._id = id
        self._name = name

    def __str__(self):
        return f"Person{{id={self._id}, name='{self._name}'}}"

    @property
    def id(self):
        return self._id

    @id.setter
    def id(self, id):
        self._id = id

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name