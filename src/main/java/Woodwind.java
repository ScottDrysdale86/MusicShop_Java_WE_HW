
public class Woodwind extends Instrument {

    private final int keyNumber;
    InstrumentType instType;
    public Woodwind(String name, String color, double costPrice, double salePrice, int keyNumber) {
        super(name, color, costPrice, salePrice);
        this.keyNumber = keyNumber;
        this.instType = InstrumentType.WOODWIND;
    }

    public int getKeyNumber() {
        return keyNumber;
    }


    public String getInstType() {
        return instType.getType();
    }

    @Override
    public String play() {
        return "Woodwind noise";
    }
}
