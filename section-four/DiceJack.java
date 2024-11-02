import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)) {
            System.out.println("\nYou entered numbers outside the valid range");
            System.exit(0);
        }

        int sumOfNumbers = (num1 + num2 + num3);
        int sumOfDiceRolls = (roll1 + roll2 + roll3);

        System.out.println("Your sum: " + sumOfNumbers + " -- Computer sum: " + sumOfDiceRolls);
        if (userWon(sumOfNumbers, sumOfDiceRolls)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nBetter luck next time!");
        }

        scanner.close();
    }

    /**
     * function name: diceRoll - Returns an int value between 1 and 6 that
     * represents the value of a dice.
     * 
     * @return dice value (int)
     */
    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    /**
     * function name: isLessThan1 - This function checks if a number is less than 1
     * and returns true or false.
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return (boolean)
     */
    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    /**
     * function name: isHigherThan6 - Returns true or false if one of the numbers
     * are higher than 6.
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return (boolean)
     */
    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    /**
     * Returns true or false if the sum of the numbers is higher than the sum of the
     * dice rolls and the diference is less than 3.
     * 
     * @param sumNumbers
     * @param diceRolls
     * @return (boolean)
     */
    public static boolean userWon(int sumNumbers, int diceRolls) {
        return (sumNumbers > diceRolls) && (sumNumbers - diceRolls < 3);
    }
}