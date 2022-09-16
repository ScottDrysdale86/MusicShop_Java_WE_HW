
public class Percussion extends Instrument {

    private final int drumsInKit;
    InstrumentType instType;
    public Percussion(String name, String color, double costPrice, double salePrice, int drumsInKit) {
        super(name, color, costPrice, salePrice);
        this.drumsInKit = drumsInKit;
        this.instType = InstrumentType.PERCUSSION;
    }

    public int getDrumsInKit() {
        return drumsInKit;
    }


    public String getInstType() {
        return instType.getType();
    }

    @Override
    public String play() {
        return "Guitar noise";
    }
}
