public interface StockObserver {
    void onPriceChanged(Stock stock, double oldPrice, double newPrice);
}
