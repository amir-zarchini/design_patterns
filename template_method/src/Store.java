public class Store extends Market {

    @Override
    protected void doSelect() {
        System.out.println("Select a product from shelve");
    }

    @Override
    protected void doPayment() {
        System.out.println("Do payment by cash or POS");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Deliver product to customer in front of store");
    }
}
