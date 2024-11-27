import java.util.HashMap;
import java.util.Map;

public class CityPopulationTracker {
    private Map<String, City> cityPopulations;

    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String name) {
        City targeCity = this.cityPopulations.get(name);
        return new City(targeCity);
    }

    public void setCity(City city) {
        City newCity = new City(city);
        this.cityPopulations.put(newCity.getName(), newCity);
    }
}
