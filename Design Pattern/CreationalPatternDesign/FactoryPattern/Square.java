public class Square implements Shape {
    private final double s;
    public Square(double s) { this.s = s; }
    public double area() { return s * s; }
    public String name() { return "Square"; }
}
