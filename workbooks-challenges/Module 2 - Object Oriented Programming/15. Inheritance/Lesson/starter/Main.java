import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.setSize(Size.MEDIUM);
        shirt.setColor("RED");
        shirt.setPrice(4.99);
        shirt.setBrand("NIKE");
        shirt.fold();

        Pants pants = new Pants();
        pants.setColor("BLACK");
        pants.setWaist(32);
        pants.setLength(32);
        pants.setPrice(7.99);
        pants.setBrand("LEVI'S");
        pants.fold();
    }

}
