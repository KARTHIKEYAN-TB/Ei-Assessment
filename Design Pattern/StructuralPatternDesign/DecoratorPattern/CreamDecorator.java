public class CreamDecorator extends BeverageDecorator {
    public CreamDecorator(Beverage base) { super(base); }
    public String description() { return base.description() + ", Cream"; }
    public double cost() { return base.cost() + 0.8; }
}
