from hashlib import new


class Student:
    def __init__(self,id,name,nationality,career,scholarship):
        self.__id = id
        self.__name = name
        self.__nationality = nationality
        self.__career = career
        self.__scholarship = scholarship

    ##Getters
    def get_Id(self):
        return self.__id
    
    def get_Name(self):
        return self.__name
    
    def get_Nationality(self):
        return self.__nationality
    
    def get_Career(self):
        return self.__career
    
    def get_Scholarship(self):
        return self.__scholarship
    
    ##Setters
    def set_Id(self,id):
        self.__id = id

    def set_Name(self,name):
        self.__name = name

    def set_Nationality(self,nationality):
        self.__nationality = nationality

    def set_Career(self,career):
        self.__career = career

    def set_Scholarship(self,scholarship):
        self.__scholarship = scholarship
