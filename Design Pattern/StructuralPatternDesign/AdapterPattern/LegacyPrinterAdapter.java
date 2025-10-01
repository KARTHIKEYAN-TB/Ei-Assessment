public class LegacyPrinterAdapter implements AdvancedPrinter {
    private final LegacyPrinter legacy;
    public LegacyPrinterAdapter(LegacyPrinter legacy) { this.legacy = legacy; }

    @Override
    public void printDocument(String title, String body) {
        String text = "Title: " + title + "\n" + body;
        legacy.printText(text);
    }
}
