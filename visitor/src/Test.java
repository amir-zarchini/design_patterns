public class Test {

    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[] {
                new Book("2345", 100),
                new Book("1276", 40),
                new Oil("xOil", 30, 5)
        };

        calculate(items);
    }

    private static void calculate(ItemElement[] items) {

        ShoppingCart cart = new ShoppingCartImpl();

        float totalPrice = 0;

        for (ItemElement item : items) {
            totalPrice += item.accept(cart);
        }

        System.out.println("Total price: " + totalPrice);
    }
}
