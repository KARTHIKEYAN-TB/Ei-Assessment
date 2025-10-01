public class Main {
    public static void main(String[] args) {
        Shape c = ShapeFactory.create("circle", 3.0);
        Shape s = ShapeFactory.create("square", 4.0);
        Shape r = ShapeFactory.create("rectangle", 2.0, 5.0);

        System.out.println(c.name() + " area=" + c.area());
        System.out.println(s.name() + " area=" + s.area());
        System.out.println(r.name() + " area=" + r.area());
    }
}
