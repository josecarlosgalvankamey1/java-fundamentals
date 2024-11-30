package shape;

import static java.lang.Math.PI;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return ((4 / 3) * PI) * (getRadius() * getRadius() * getRadius());
    }

    @Override
    public double getVolume() {
        return (4 * PI * (getRadius() * getRadius()));
    }
}