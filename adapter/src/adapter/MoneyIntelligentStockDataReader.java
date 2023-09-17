package adapter;

public class MoneyIntelligentStockDataReader implements IntelligentStockDataReader {

    @Override
    public JsonData read() {
        return new JsonData("Money market intelligent data.");
    }
}
