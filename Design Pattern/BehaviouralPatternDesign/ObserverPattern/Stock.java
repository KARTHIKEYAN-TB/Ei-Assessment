public class Stock {
    private final String symbol;
    private double price;

    public Stock(String symbol, double price) {
        if (symbol == null || symbol.isBlank()) throw new IllegalArgumentException("Symbol required");
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.symbol = symbol.toUpperCase();
        this.price = price;
    }

    public String getSymbol() { return symbol; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() { return symbol + "@" + price; }
}
