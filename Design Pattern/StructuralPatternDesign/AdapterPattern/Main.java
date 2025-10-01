public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacy = new LegacyPrinter();
        AdvancedPrinter printer = new LegacyPrinterAdapter(legacy);

        printer.printDocument("Adapter Demo", "Printing through adapter works!");
    }
}
