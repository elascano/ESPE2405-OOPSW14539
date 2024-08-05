# utils/file_manager.py

import os
import json

class FileManager:
    @staticmethod
    def save(data, path, extension):
        with open(f"{path}.{extension}", 'w') as file:
            file.write(data)

    @staticmethod
    def find(keyword, path, extension):
        results = []
        with open(f"{path}.{extension}", 'r') as file:
            lines = file.readlines()
            for line in lines:
                if keyword in line:
                    results.append(line)
        return results

    @staticmethod
    def update(old_data, new_data, path, extension):
        with open(f"{path}.{extension}", 'r') as file:
            lines = file.readlines()
        with open(f"{path}.{extension}", 'w') as file:
            for line in lines:
                if old_data in line:
                    file.write(line.replace(old_data, new_data))
                else:
                    file.write(line)

    @staticmethod
    def delete(data_to_delete, path, extension):
        with open(f"{path}.{extension}", 'r') as file:
            lines = file.readlines()
        with open(f"{path}.{extension}", 'w') as file:
            for line in lines:
                if data_to_delete not in line:
                    file.write(line)
