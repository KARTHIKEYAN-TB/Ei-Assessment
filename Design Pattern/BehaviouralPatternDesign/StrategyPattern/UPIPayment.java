public class UPIPayment implements PaymentStrategy {
    private final String upiId;
    public UPIPayment(String upiId) { this.upiId = upiId; }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using UPI: " + upiId);
        return true;
    }

    @Override
    public String name() { return "UPI"; }
}
