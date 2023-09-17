public class MemoryReport {

    private static int totalSize = 0;

    public static void calculate(int objectSize) {
        totalSize += objectSize;
    }

    public static void print() {
        System.out.println("Total memory consumed by trees: " + (totalSize / 1024) + " MB");
    }

}
