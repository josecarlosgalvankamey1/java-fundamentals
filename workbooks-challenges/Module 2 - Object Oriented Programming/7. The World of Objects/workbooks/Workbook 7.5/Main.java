public class Main {

    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        boolean wasPassportApproved = person.applyPassport();

        person.chooseSeat();

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        if (wasPassportApproved) {
            System.out.println("Congratulations Rayan Slim. Your passport was approved!");
        } else {
            System.out.println("We are sorry Rayan Slim. We cannot process your application.");
        }
    }

}
