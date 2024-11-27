public class Main {
    public static void main(String[] args) {
        CityPopulationTracker tracker = new CityPopulationTracker();

        // Test the addCity method
        tracker.setCity(new City("New York", "USA", 8550405));
        tracker.setCity(new City("Los Angeles", "USA", 3971883));

        // Test the getCity method
        City nyCity = tracker.getCity("New York");
        System.out.println("Population of New York: " + nyCity.getPopulation());

        // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8600000);
        tracker.setCity(updatedNyCity);

        // Verify that the city data was updated
        nyCity = tracker.getCity("New York");
        System.out.println("Updated population of New York: " + nyCity.getPopulation());
    }
}