import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(3.99, "RED", "NIKE", Size.MEDIUM);
        shirt.fold();

        Pants pants = new Pants(7.99, "BLACK", "LEVI'S", 32, 32);
        pants.fold();

        productStore(pants);
        productStore(shirt);

        pantStore(pants);
        shirtStore(shirt);
    }

    public static void productStore(Product product) {
        System.out.println(
                "\nThank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName()
                        + " Your total comes to "
                        + product.getPrice());
    }

    public static void pantStore(Pants pants) {
        System.out.println("\nThank you for purchasing the " + pants.getBrand() + " Pants. " + "Your total comes to "
                + pants.getPrice());
    }

    public static void shirtStore(Shirt shirt) {
        System.out.println("\nThank you for purchasing the " + shirt.getBrand() + " Shirt. " + "Your total comes to "
                + shirt.getPrice());
    }
}
