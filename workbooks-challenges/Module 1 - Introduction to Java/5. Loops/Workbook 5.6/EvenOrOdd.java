public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        for (int i = 0; i < 20; i++) {
            System.out.print(i + " -");
            if (i % 2 == 0) {
                System.out.println(" even");
            } else {
                System.out.println(" odd");
            }
        }
    }
}
