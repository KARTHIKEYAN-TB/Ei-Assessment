public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String holder;

    public CreditCardPayment(String cardNumber, String holder) {
        this.cardNumber = cardNumber;
        this.holder = holder;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card by " + holder);
        return true;
    }

    @Override
    public String name() { return "CreditCard"; }
}
