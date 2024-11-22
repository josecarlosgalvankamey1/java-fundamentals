import java.util.Objects;

public class City {

    private String name;
    private long population;

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof City))
            return false;

        City city = (City) obj;
        return Objects.equals(this.name, city.name) && this.population == city.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.population);
    }
}
