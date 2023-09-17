public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public float visit(Book book) {
        System.out.println("Item[Book]: " + book.getIsbn() +
                " Price= " + book.getPrice());
        if(book.getPrice() > 50)
            return book.getPrice() - 5;
        else
            return book.getPrice();
    }

    @Override
    public float visit(Oil oil) {
        System.out.println("Item[Oil]: " + oil.getBrand()
                + " Price per Kg: " + oil.getPricePerKg()
                + " Total weight(Kg): " + oil.getTotalWeight()) ;

        return oil.getPricePerKg() * oil.getTotalWeight();
    }
}
