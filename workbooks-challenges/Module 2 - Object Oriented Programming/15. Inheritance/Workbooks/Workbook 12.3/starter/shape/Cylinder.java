package shape;

import static java.lang.Math.PI;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((2 * PI) * (getRadius() * getRadius())) + ((2 * PI) * getHeight());
    }

    @Override
    public double getVolume() {
        return (PI * (getRadius() * getRadius()) * (getHeight()));
    }
}
