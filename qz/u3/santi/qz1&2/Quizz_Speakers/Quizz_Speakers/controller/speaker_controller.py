from controller.speaker_dao import SpeakerDAO
from model.speaker import Speaker
from typing import List

class SpeakerController:
    def __init__(self, speaker_dao: SpeakerDAO):
        self.speaker_dao = speaker_dao

    def create_speaker(self, speaker: Speaker):
        self.speaker_dao.create(speaker)

    def read_speaker(self, speaker_id: str) -> Speaker:
        return self.speaker_dao.read(speaker_id)

    def update_speaker(self, speaker: Speaker):
        self.speaker_dao.update(speaker)

    def delete_speaker(self, speaker_id: str):
        self.speaker_dao.delete(speaker_id)

    def list_all_speakers(self) -> List[Speaker]:
        return self.speaker_dao.list_all()
