public class Test {

    public static void main(String[] args) {

        System.out.println("Online market");
        Market online = new Online();
        online.shop(false);

        System.out.println();
        System.out.println("Store");
        Market store = new Store();
        store.shop(true);

    }
}
