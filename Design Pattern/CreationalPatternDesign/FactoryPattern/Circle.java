public class Circle implements Shape {
    private final double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
    public String name() { return "Circle"; }
}
