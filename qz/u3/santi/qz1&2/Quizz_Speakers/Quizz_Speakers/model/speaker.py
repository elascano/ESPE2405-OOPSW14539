class Speaker:
    def __init__(self, speaker_id: str, brand: str, power: float, frequency: float):
        self.id = speaker_id
        self.brand = brand
        self.power = power
        self.frequency = frequency

    def calculate_quality_index(self) -> float:
        return self.power * self.frequency

    # Getters and setters
    def get_id(self):
        return self.id

    def set_id(self, speaker_id):
        self.id = speaker_id

    def get_brand(self):
        return self.brand

    def set_brand(self, brand):
        self.brand = brand

    def get_power(self):
        return self.power

    def set_power(self, power):
        self.power = power

    def get_frequency(self):
        return self.frequency

    def set_frequency(self, frequency):
        self.frequency = frequency
