import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String faceDownCard = faceDown();
        int dealerHandValue = 0;

        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int randomCardNumber1 = drawRandomCard();
        int randomCardNumber2 = drawRandomCard();
        String card1 = cardString(randomCardNumber1);
        String card2 = cardString(randomCardNumber2);
        System.out.println("\n You get a \n" + card1 + "\n and a \n" + card2);

        int handValue = (randomCardNumber1 + randomCardNumber2);
        System.out.println("Your total is: " + handValue);

        int dealerRandomCardNumber1 = drawRandomCard();
        int dealerRandomCardNumber2 = drawRandomCard();
        String dealerCard1 = cardString(dealerRandomCardNumber1);
        String dealerCard2 = cardString(dealerRandomCardNumber2);

        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down\n" + faceDownCard);
        System.out.println("\nThe deale's total is hidden");

        while (true) {
            String userOption = hitOrStay();

            if (userOption.equals("stay")) {
                break;
            }

            int newRandomNumberCard = drawRandomCard();
            String newCard = cardString(newRandomNumberCard);
            System.out.println("\n You get a \n" + newCard);
            System.out.println();
            System.out.println();
            handValue += newRandomNumberCard;
            System.out.println("Your new total is " + handValue);

            if (handValue > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are\n" + dealerCard1 + "\n and a \n" + dealerCard2);

        while (dealerHandValue < 17) {
            int newRandomNumberCard = drawRandomCard();
            String newCard = cardString(newRandomNumberCard);
            System.out.println("\n Dealer gets a \n" + newCard);
            dealerHandValue += newRandomNumberCard;

            System.out.println("\nDealer's total is " + dealerHandValue);

            if (dealerHandValue > 21) {
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            }
        }

        if (handValue > dealerHandValue) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

        scan.close();

    }

    /**
     * Function name – drawRandomCard
     * 
     * @return (int)
     *
     *         Inside the function:
     *         1. Gets a random number between 1 and 13.
     *         2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 12 + 1);
    }

    /**
     * Function name – cardString
     * 
     * @param cardNumber (int)
     * @return (String)
     *
     *         Inside the function:
     *         1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {

        switch (cardNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";

            default:
                return "Invalid card number!";
        }
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /**
     * Function name – hitOrStay
     * 
     * @return (String)
     *
     *         Inside the function:
     *         1. Asks the user to hit or stay.
     *         2. If the user doesn't enter "hit" or "stay", keep asking them to try
     *         again by printing:
     *         Please write 'hit' or 'stay'
     *         3. Returns the user's option
     */
    public static String hitOrStay() {
        String userOption = "";

        System.out.println("Please write 'hit' or 'stay'");
        userOption = scan.nextLine();

        while (!userOption.equals("hit") && !userOption.equals("stay")) {
            System.out.println("Please write 'hit' or 'stay'");
            userOption = scan.nextLine();
        }

        return userOption;
    }
}
