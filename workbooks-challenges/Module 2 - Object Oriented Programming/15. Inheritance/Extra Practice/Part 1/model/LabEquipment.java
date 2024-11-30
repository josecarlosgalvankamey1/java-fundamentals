package model;

public abstract class LabEquipment {
    private static final int MIN_YEAR = 1950;
    private String manufacturer;
    private String model;
    private int year;

    public LabEquipment(String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer.isBlank() || manufacturer == null) {
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model == null) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR) {
            throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
        }
        this.year = year;
    }

    public abstract String performMaintenance();
}