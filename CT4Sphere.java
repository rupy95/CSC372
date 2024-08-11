
public class Sphere extends Shape {
    private double Radius;

    public Sphere(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * Radius * Radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(Radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere [Surface Area = " + surface_area() + ", Volume = " + volume() + "]";
    }
}
