import java.util.ArrayList;

public class Shop {

    private final ArrayList<ISell> stock;

    public Shop() {
        this.stock  = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public int getStockCount() {
        return getStock().size();
    }

    public void add(ISell product) {
        stock.add(product);
    }

    public void remove(ISell product) {
        stock.remove(product);
    }

    public double calculateTotalProfit(){
        double total = 0;
        for (ISell product:this.stock) {
            total += product.calcProfit();
        }
        return total;
    }
}
