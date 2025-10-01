import java.util.*;

public class StockMarket {
    private final Map<String, Stock> stocks = new HashMap<>();
    private final List<StockObserver> observers = new ArrayList<>();

    public void addStock(Stock s) { stocks.put(s.getSymbol(), s); }

    public void register(StockObserver o) { observers.add(o); }

    public void updatePrice(String symbol, double newPrice) {
        Stock s = stocks.get(symbol.toUpperCase());
        if (s == null) {
            System.out.println("Stock not found: " + symbol);
            return;
        }
        double old = s.getPrice();
        if (old == newPrice) return;
        s.setPrice(newPrice);
        for (StockObserver o : observers) {
            o.onPriceChanged(s, old, newPrice);
        }
    }
}
