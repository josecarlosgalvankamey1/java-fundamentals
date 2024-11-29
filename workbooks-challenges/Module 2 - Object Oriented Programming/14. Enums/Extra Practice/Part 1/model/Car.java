package model;

public class Car {
    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
    }

    private String make;
    private String model;
    private int productionYear;
    private double price;
    private BodyType bodyType;

    public static final int MIN_YEAR = 1900;
    public static final int MIN_PRICE = 0;
    public static final int MAX_PRICE = 200000;

    public Car(String make, String model, int productionYear, double price, BodyType bodyType) {
        setMake(make);
        setModel(model);
        setProductionYear(productionYear);
        setPrice(price);
        setBodyType(bodyType);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make.isBlank() || make == null) {
            throw new IllegalArgumentException("The make cannot be null or blank.");
        }
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model == null) {
            throw new IllegalArgumentException("The model cannot be null or blank.");
        }
        this.model = model;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("The body type cannot be null.");
        }
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < MIN_YEAR) {
            throw new IllegalArgumentException(
                    "The production year must be greater than or equal to the minimun year.");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("The price must be within a valid range.");
        }
        this.price = price;
    }

}