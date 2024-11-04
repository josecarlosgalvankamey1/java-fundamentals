import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        int secretNumber = generateRandomNumber();
        int userNumber = -1;

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);
        userNumber = scan.nextInt();

        while (userNumber != secretNumber) {
            System.out.println("Guess again!");
            userNumber = scan.nextInt();
        }

        System.out.println("You got it!");
        scan.close();
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 4 + 1);
    }
}
