public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage base) { super(base); }
    public String description() { return base.description() + ", Sugar"; }
    public double cost() { return base.cost() + 0.2; }
}
