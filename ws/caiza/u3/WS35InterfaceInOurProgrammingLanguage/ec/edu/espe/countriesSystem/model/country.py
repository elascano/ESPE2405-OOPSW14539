class CountryModel:
    def __init__(self, pais, capital, area, poblacion):
        self.pais = pais
        self.capital = capital
        self.area = float(area)
        self.poblacion = float(poblacion)

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

    def __str__(self):
        return (f"Country: {self.pais}, Capital: {self.capital}, "
                f"Area: {self.area} km², Population: {self.poblacion} million, "
                f"Density: {self.calculate_density():.2f} people/km²")
