
public class Cylinder extends Shape {
    private double Radius;
    private double height;

    public Cylinder(double Radius, double height) {
        this.Radius = Radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * Radius * (Radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Radius * Radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [Surface Area = " + surface_area() + ", Volume = " + volume() + "]";
    }
}
