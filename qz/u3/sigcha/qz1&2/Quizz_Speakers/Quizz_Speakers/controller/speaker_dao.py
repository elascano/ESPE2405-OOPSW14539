from abc import ABC, abstractmethod
from model.speaker import Speaker
from typing import List

class SpeakerDAO(ABC):
    @abstractmethod
    def create(self, speaker: Speaker):
        pass

    @abstractmethod
    def read(self, speaker_id: str) -> Speaker:
        pass

    @abstractmethod
    def update(self, speaker: Speaker):
        pass

    @abstractmethod
    def delete(self, speaker_id: str):
        pass

    @abstractmethod
    def list_all(self) -> List[Speaker]:
        pass
