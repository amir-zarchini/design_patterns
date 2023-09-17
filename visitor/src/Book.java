public class Book implements ItemElement {

    private final String isbn;
    private final float price;

    public Book(String isbn, float price) {
        this.isbn = isbn;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public float accept(ShoppingCart cart) {
        return cart.visit(this);
    }
}
