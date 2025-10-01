public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addStock(new Stock("AAPL", 150.0));
        market.addStock(new Stock("GOOG", 2700.0));

        market.register(new EmailNotifier("user@example.com"));
        market.register(new MobileNotifier("+919000000000"));

        market.updatePrice("AAPL", 152.5);
        market.updatePrice("MSFT", 300); // not found
    }
}
