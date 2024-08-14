package ec.edu.espe.q61_70.view;

import ec.edu.espe.q61_70.model.Country;
import java.util.List;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class CountryView {
    
    public void displayCountryDetails(Country country) {
        System.out.println("Country Details: " + country);
    }

    public void displayCountryList(List<Country> countries) {
        System.out.println("Country List:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public Country getCountryInput() {
        
        return new Country(1, "Dummy Country", "Dummy Capital", 1000000, 50000);
    }
}
