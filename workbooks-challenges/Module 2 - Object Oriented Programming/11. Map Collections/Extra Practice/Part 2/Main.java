import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.setCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
    }

    public static boolean isNullOrBlank(String input) {
        return input.isBlank() || input == null;
    }

    public static boolean incorrectPopulation(int population) {
        return population <= 0;
    }

    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();

            if (isNullOrBlank(cityName))
                continue;

            return cityName;
        }
    }

    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();

            if (isNullOrBlank(country))
                continue;

            return country;
        }
    }

    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");

            if (!(scanner.hasNextInt())) {
                scanner.next();
                continue;
            }

            int population = scanner.nextInt();

            if (incorrectPopulation(population)) {
                continue;
            }

            return population;
        }
    }
}