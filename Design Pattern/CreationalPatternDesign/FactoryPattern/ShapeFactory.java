public class ShapeFactory {
    public static Shape create(String type, double... params) {
        switch (type.toLowerCase()) {
            case "circle": return new Circle(params[0]);
            case "square": return new Square(params[0]);
            case "rectangle": return new Rectangle(params[0], params[1]);
            default: throw new IllegalArgumentException("Unknown shape");
        }
    }
}
