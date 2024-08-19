package ec.edu.espe.q61_70.controller;
import ec.edu.espe.q61_70.model.Country;
import ec.edu.espe.q61_70.view.CountryView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class CountryController {
    private List<Country> countries;
    private CountryView view;
    private int idCounter = 1;

    public CountryController(CountryView view) {
        this.countries = new ArrayList<>();
        this.view = view;
    }

    public void addCountry(String name, String capital, long population, double area) {
        try {
            validateCountryData(name, capital, population, area);
            Country country = new Country(idCounter++, name, capital, population, area);
            countries.add(country);
        } catch (IllegalArgumentException e) {
            System.err.println("Error adding country: " + e.getMessage());
        }
    }

    public void removeCountry(int id) {
        boolean removed = countries.removeIf(country -> country.getId() == id);
        if (!removed) {
            System.out.println("Country with ID " + id + " not found.");
        }
    }

    public void updateCountry(Country updatedCountry) {
        try {
            validateCountryData(updatedCountry.getName(), updatedCountry.getCapital(), 
                                 updatedCountry.getPopulation(), updatedCountry.getArea());

            for (Country country : countries) {
                if (country.getId() == updatedCountry.getId()) {
                    country.setName(updatedCountry.getName());
                    country.setCapital(updatedCountry.getCapital());
                    country.setPopulation(updatedCountry.getPopulation());
                    country.setArea(updatedCountry.getArea());
                    return;
                }
            }
            System.out.println("Country with ID " + updatedCountry.getId() + " not found.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error updating country: " + e.getMessage());
        }
    }

    public Country getCountry(int id) {
        for (Country country : countries) {
            if (country.getId() == id) {
                return country;
            }
        }
        return null;
    }

    public void listCountries() {
        view.displayCountryList(countries);
    }

    public void showCountryDetails(int id) {
        Country country = getCountry(id);
        if (country != null) {
            view.displayCountryDetails(country);
        } else {
            System.out.println("Country with ID " + id + " not found.");
        }
    }

    private void validateCountryData(String name, String capital, long population, double area) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (capital == null || capital.trim().isEmpty()) {
            throw new IllegalArgumentException("Capital cannot be null or empty.");
        }
        if (population < 0) {
            throw new IllegalArgumentException("Population cannot be negative.");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive.");
        }
    }
}
