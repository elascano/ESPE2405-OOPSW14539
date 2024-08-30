import sys
import os

from MethodsBank import MethodsBanks
class BankController:
    @staticmethod
    def list_banks():
        return MethodsBanks().list_banks()
    
    