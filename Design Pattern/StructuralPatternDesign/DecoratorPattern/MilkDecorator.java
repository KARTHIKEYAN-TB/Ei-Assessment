public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage base) { super(base); }
    public String description() { return base.description() + ", Milk"; }
    public double cost() { return base.cost() + 0.5; }
}
