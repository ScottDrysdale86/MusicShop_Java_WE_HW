public class Instrument implements IPlay, ISell {

    private final String name;
    private final String color;
    private final double costPrice;
    private double salePrice;
    InstrumentType instrumentType;

    public Instrument(String name, String color, double costPrice, double salePrice) {
        this.name = name;
        this.color = color;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
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

    public String play() {
        return "I can play a noise";
    }

    public double calcProfit() {
        return salePrice - costPrice;
    }
}
