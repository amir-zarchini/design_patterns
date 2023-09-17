public class Online extends Market {

    @Override
    protected void doSelect() {
        System.out.println("Search a product");
        System.out.println("Add product to shopping card");
    }

    @Override
    protected void doPayment() {
        System.out.println("Do payment by credit card/e-banking");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Deliver product by Post");
    }
}
