import java.util.Scanner;

public class Hangman {

        public static Scanner scan = new Scanner(System.in);

        public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
                        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
                        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
                        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
                        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
                        "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
                        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
                        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
                        "wombat", "zebra" };

        public static String[] gallows = { "+---+\n" +
                        "|   |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        "+---+\n" +
                                        "|   |\n" +
                                        "O   |\n" +
                                        "|   |\n" +
                                        "    |\n" +
                                        "    |\n" +
                                        "=========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|   |\n" +
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a
                                                      // trailing escape
                                                      // character, which also happens to be '\'
                                        "     |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/    |\n" +
                                        "     |\n" +
                                        " =========\n",

                        " +---+\n" +
                                        " |   |\n" +
                                        " O   |\n" +
                                        "/|\\  |\n" +
                                        "/ \\  |\n" +
                                        "     |\n" +
                                        " =========\n" };

        public static void main(String[] args) {
                char[] word = randomWord(words);
                char[] placeholders = new char[word.length];
                StringBuilder missedGuesses = new StringBuilder();
                int incorrectGuesses = 0;

                generatePlaceholders(placeholders);

                System.out.println("Word: " + String.valueOf(word));

                while (incorrectGuesses != 6 && !String.valueOf(word).equals(String.valueOf(placeholders))) {
                        printGallow(incorrectGuesses);
                        printPlaceholders(placeholders);
                        printMissedGuesses(missedGuesses);

                        System.out.print("Guess: ");
                        char userCharacter = scan.nextLine().charAt(0);
                        System.out.println();

                        while (!(userCharacter >= 'a' && userCharacter <= 'z')) {
                                System.out.print("Please enter a valid character: ");
                                userCharacter = scan.nextLine().charAt(0);
                        }

                        int ocurrences = getOcurrences(word, userCharacter);

                        if (ocurrences == 0) {
                                ++incorrectGuesses;
                                missedGuesses.append(userCharacter);
                        } else {
                                updatePlaceholders(placeholders, word, userCharacter);
                        }

                }

                printGallow(incorrectGuesses);
                printPlaceholders(placeholders);
                printMissedGuesses(missedGuesses);

                if (String.valueOf(word).equals(String.valueOf(placeholders))) {
                        System.out.println("User wins!");
                } else {
                        System.out.println("RIP!");
                        System.out.println("The word was: " + String.valueOf(word));
                }

        }

        public static char[] randomWord(String[] words) {
                int index = (int) (Math.random() * words.length);
                return words[index].toCharArray();
        }

        public static boolean checkGuess(char[] word, char userCharacter) {
                for (char character : word) {
                        if (character == userCharacter)
                                return true;
                }
                return false;
        }

        public static void generatePlaceholders(char[] placeholders) {
                for (int i = 0; i < placeholders.length; ++i)
                        placeholders[i] = '_';
        }

        public static void printPlaceholders(char[] placeholders) {
                System.out.print("Word:\t");
                for (int i = 0; i < placeholders.length; ++i) {
                        System.out.print(placeholders[i] + " ");
                }
                System.out.print("\n\n");
        }

        public static void printMissedGuesses(StringBuilder missedGuesses) {
                System.out.print("Misses:\t" + missedGuesses + "\n\n");
        }

        public static void printGallow(int missedGuesses) {
                System.out.println(gallows[missedGuesses]);
        }

        public static void updatePlaceholders(char[] placeholders, char[] word, char correctCharacter) {
                for (int i = 0; i < word.length; ++i) {
                        if (word[i] == correctCharacter) {
                                placeholders[i] = correctCharacter;
                        }
                }
        }

        public static int getOcurrences(char[] word, char correctCharacter) {
                int ocurrences = 0;
                for (int i = 0; i < word.length; ++i) {
                        if (word[i] == correctCharacter)
                                ++ocurrences;
                }
                return ocurrences;
        }
}
