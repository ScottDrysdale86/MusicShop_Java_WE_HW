public class Keyed extends Instrument implements IPlay
{

    InstrumentType instType;
    KeyedType keyType;

    public Keyed(String name, String color, double costPrice, double salePrice, KeyedType keyType) {
        super(name, color, costPrice, salePrice);
        this.keyType = keyType;
        this.instType = InstrumentType.KEYED;
    }

    public String getInstType() {
        return instType.getType();
    }

    public String getKeyType() {
        return keyType.getType();
    }

    @Override
    public String play() {
        return "Keyed noise";
    }
}

