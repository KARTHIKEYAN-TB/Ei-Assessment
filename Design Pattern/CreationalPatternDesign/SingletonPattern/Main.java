public class Main {
    public static void main(String[] args) {
        AppLogger l1 = AppLogger.getInstance();
        AppLogger l2 = AppLogger.getInstance();

        l1.info("Logging with logger 1");
        l2.info("Logging with logger 2");

        System.out.println("Same instance? " + (l1 == l2));
    }
}
