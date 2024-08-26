public class Stand:

def __init__(self,id, balance, posture):
self.-id = id
self._balance = balance
        
        self._posture = posture

    # Getter methods
    def get_balance(self):
        return self._balance

    def get_id(self):
        return self._id

    def get_posture(self):
        return self._posture

    # Setter methods
    def set_balance(self, balance):
        self._balance = balance

    def set_id(self, id):
        self._id = id

    def set_posture(self, posture):
        self._posture = posture

        def to_dict(self):
        return {
            "id": self._id,
            "balance": self._balance,
            
            "posture": self._posture
        }
def from_dict(cls, data):
        return cls( data["id"],data["balance"], data["posture"])

    def __str__(self):
        return f"ID: {self._id}, Balance: {self._balance}, Posture: {self._posture}"

 