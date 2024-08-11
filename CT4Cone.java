
public class Cone extends Shape {
    private double Radius;
    private double height;

    public Cone(double Radius, double height) {
        this.Radius = Radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double l = Math.sqrt((Radius * Radius) + (height * height));
        return Math.PI * Radius * (Radius + l);
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Radius * Radius * height;
    }

    @Override
    public String toString() {
        return "Cone [Surface Area = " + surface_area() + ", Volume = " + volume() + "]";
    }
}
