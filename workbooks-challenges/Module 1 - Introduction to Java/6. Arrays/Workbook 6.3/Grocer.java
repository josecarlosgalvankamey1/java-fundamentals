public class Grocer {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.3).

        String[] products = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

        System.out.println("\nDo you sell coffee?");

        int index = -1;
        for (int i = 0; i < products.length; ++i) {
            if (products[i].equals("coffee")) {
                index = i;
                break;
            }
        }

        System.out.println("\nWe have that in aisle: " + index);

    }
}
