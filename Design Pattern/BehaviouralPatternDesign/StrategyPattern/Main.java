public class Main {
    public static void main(String[] args) {
        PaymentProcessor proc = new PaymentProcessor();

        proc.setStrategy(new CreditCardPayment("4111111111111111", "User"));
        proc.process(200.0);

        proc.setStrategy(new UPIPayment("User@upi"));
        proc.process(50.0);

        proc.setStrategy(new PayPalPayment("User.paypal@example.com"));
        proc.process(75.0);
    }
}
