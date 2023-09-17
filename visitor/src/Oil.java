public class Oil implements ItemElement {

    private final String brand;
    private final float pricePerKg;
    private final float totalWeightPerKg;

    public Oil(String brand, float pricePerKg, float totalWeightPerKg) {
        this.brand = brand;
        this.pricePerKg = pricePerKg;
        this.totalWeightPerKg = totalWeightPerKg;
    }

    public String getBrand() {
        return brand;
    }

    public float getPricePerKg() {
        return pricePerKg;
    }

    public float getTotalWeight() {
        return totalWeightPerKg;
    }

    @Override
    public float accept(ShoppingCart cart) {
        return cart.visit(this);
    }
}
