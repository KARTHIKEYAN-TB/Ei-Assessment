public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy s) { this.strategy = s; }

    public void process(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected!");
            return;
        }
        strategy.pay(amount);
    }
}
