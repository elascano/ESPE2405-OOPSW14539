<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
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
<<<<<<< HEAD
=======
=======
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
>>>>>>> 8e40484f0077d7fe10786aa1aa0f3cc51debe068
>>>>>>> a064af6ecab12755c8c8b8a5858b342fd47aa80f
        self._name = name