public class Main {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new CreamDecorator(coffee);

        System.out.println("Order: " + coffee.description());
        System.out.println("Cost: $" + coffee.cost());
    }
}
