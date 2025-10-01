public class PayPalPayment implements PaymentStrategy {
    private final String email;
    public PayPalPayment(String email) { this.email = email; }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
        return true;
    }

    @Override
    public String name() { return "PayPal"; }
}
