public abstract class BeverageDecorator implements Beverage {
    protected final Beverage base;
    public BeverageDecorator(Beverage base) { this.base = base; }
}
