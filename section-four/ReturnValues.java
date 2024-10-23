public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateArea(2.3, 3.5);
        System.out.println("Area: " + area);
        System.out.println("Area: " + calculateArea(2.6, 4.2));

        calculateArea(-5, 2.3);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimensions");
            System.exit(0);
        }
        return length * width;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not available";
        }
    }
}
