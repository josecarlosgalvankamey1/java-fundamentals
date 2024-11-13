import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person carlos = new Person();

        carlos.name = "Carlos";
        carlos.nationality = "Mexican";
        carlos.dateOfBirth = "26/08/2001";
        carlos.passport = new String[] { carlos.name, carlos.nationality, carlos.dateOfBirth };
        carlos.seatNumber = 9;

        System.out.println(carlos.name);
        System.out.println(carlos.nationality);
        System.out.println(carlos.dateOfBirth);
        System.out.println(Arrays.toString(carlos.passport));
        System.out.println(carlos.seatNumber);
    }
}
