import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n**********Javapedia**********");

        System.out.println("How many historical figures will you register?");
        int historicalFigures = scan.nextInt();

        String[][] javapedia = new String[historicalFigures][3];

        scan.nextLine();

        for (int i = 0; i < historicalFigures; ++i) {
            System.out.println("\n\tFigure " + (i + 1));

            System.out.print("\t - Name: ");
            String name = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            String birth = scan.nextLine();

            System.out.print("\t - Occupation: ");
            String occupation = scan.nextLine();

            javapedia[i][0] = name;
            javapedia[i][1] = birth;
            javapedia[i][2] = occupation;

            System.out.print("\n");
        }

        System.out.println("These are the values you stored:");
        print2DArray(javapedia);

        System.out.print("\nWho do you want information on? ");
        String targetName = scan.nextLine();

        for (int i = 0; i < javapedia.length; ++i) {
            if (javapedia[i][0].equals(targetName)) {
                System.out.println("\t Name: " + javapedia[i][0]);
                System.out.println("\t Date of birth: " + javapedia[i][1]);
                System.out.println("\t Occupation: " + javapedia[i][2]);
                break;
            }
        }

        scan.close();
    }

    /**
     * Function name: print2DArray
     * 
     * @param array (String[][])
     * 
     *              Inside the function
     *              1. print the database
     *              • a tab of space precedes each row.
     *              • each value in database has one space from the other value.
     *              • print a new line.
     */

    public static void print2DArray(String[][] javapedia) {
        for (int i = 0; i < javapedia.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < javapedia[i].length; ++j) {
                System.out.print(javapedia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
