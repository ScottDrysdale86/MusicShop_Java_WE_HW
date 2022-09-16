
public class Guitar extends Instrument {

    private final int stringNumber;
    InstrumentType instType;
    GuitarType guitarType;
    public Guitar(String name, String color,  double costPrice, double salePrice, int stringNumber, GuitarType guitarType) {
        super(name, color, costPrice, salePrice);
        this.stringNumber = stringNumber;
        this.guitarType = guitarType;
        this.instType = InstrumentType.STRING;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String getGuitarType() {
        return guitarType.getType();
    }
    public String getInstType() {
        return instType.getType();
    }

    @Override
    public String play() {
        return "Guitar noise";
    }
}
