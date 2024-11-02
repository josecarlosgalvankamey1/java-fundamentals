public class DiceJack {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
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
}