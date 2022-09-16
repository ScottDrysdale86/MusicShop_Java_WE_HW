public class Item implements ISell {
    private final String itemName;
    private final double costPrice;
    private double salePrice;
    public Item(String itemName, double costPrice, double salePrice) {
        this.itemName = itemName;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }
    @Override
    public double calcProfit() {
        return salePrice-costPrice;
    }

    public String getName() {
        return itemName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;

    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
