public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null) {
            throw new IllegalArgumentException("The name cannot be null or blank.");
        }
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country.isBlank() || country == null) {
            throw new IllegalArgumentException("The country cannot be null or blank.");
        }
        this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        if (population <= 0) {
            throw new IllegalArgumentException("The population must be greater than 0");
        }
        this.population = population;
    }

}
