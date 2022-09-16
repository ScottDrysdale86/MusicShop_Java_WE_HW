
public class Brass extends Instrument {

    private final int valveNumber;
    InstrumentType instType;

    public Brass(String name, String color, double costPrice, double salePrice, int valveNumber) {
        super(name, color, costPrice, salePrice);
        this.valveNumber = valveNumber;
        this.instType = InstrumentType.BRASS;
    }

    public int getValveNumber() {
        return valveNumber;
    }


    public String getInstType() {
        return instType.getType();
    }

    @Override
    public String play() {
        return "Brass Instrument noise";
    }
}
