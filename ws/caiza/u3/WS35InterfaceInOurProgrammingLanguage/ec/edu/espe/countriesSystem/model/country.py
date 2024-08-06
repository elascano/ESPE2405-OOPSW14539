class CountryModel:
    def __init__(self, pais, capital, area, poblacion):
        self.pais = pais
        self.capital = capital
        self.area = area
        self.poblacion = poblacion

    def to_dict(self):
        return {
            'pais': self.pais,
            'capital': self.capital,
            'area': self.area,
            'poblacion': self.poblacion,
            'densidad': self.calculate_density()
        }

    def calculate_density(self):
        return self.poblacion / self.area if self.area > 0 else 0
