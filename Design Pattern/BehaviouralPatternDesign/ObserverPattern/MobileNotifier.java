public class MobileNotifier implements StockObserver {
    private final String number;
    public MobileNotifier(String number) { this.number = number; }
    @Override
    public void onPriceChanged(Stock stock, double oldPrice, double newPrice) {
        System.out.println("SMS to " + number + ": " + stock.getSymbol() + " is now " + newPrice);
    }
}
