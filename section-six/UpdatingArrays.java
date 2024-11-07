import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Macchiato" };
        System.out.println("Menu: " + Arrays.toString(menu));

        menu[2] = "Latte";
        System.out.println("Menu: " + Arrays.toString(menu));

        String[] newMenu = Arrays.copyOf(menu, 5);
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println("New menu: " + Arrays.toString(newMenu));

    }
}
