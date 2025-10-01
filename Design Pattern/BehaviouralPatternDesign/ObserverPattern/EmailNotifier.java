public class EmailNotifier implements StockObserver {
    private final String email;
    public EmailNotifier(String email) { this.email = email; }
    @Override
    public void onPriceChanged(Stock stock, double oldPrice, double newPrice) {
        System.out.println("Email to " + email + ": " + stock.getSymbol() + " changed " + oldPrice + " -> " + newPrice);
    }
}
