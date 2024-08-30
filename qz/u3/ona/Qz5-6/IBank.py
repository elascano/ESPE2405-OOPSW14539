from abc import ABC, abstractmethod
from Banks import Banks
from typing import List

class IBanks(ABC):
    
    @abstractmethod
    def list_banks(self) -> List[Banks]:        
        pass

    @abstractmethod
    def add_bank(self, bank: Banks)-> None:
        pass