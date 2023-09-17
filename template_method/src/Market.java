public abstract class Market {

    public final void shop(boolean isGift) {
        doSelect();
        if(isGift) {
            wrap();
        }
        doPayment();
        doDelivery();
    }

    private void wrap() {
        System.out.println("Wrapping product successfully");
    }

    protected abstract void doSelect();

    protected abstract void doPayment();

    protected abstract void doDelivery();
}
