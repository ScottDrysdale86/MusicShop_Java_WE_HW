public enum InstrumentType {
    WOODWIND("Woodwind"),
    STRING("String"),
    BRASS("Brass"),
    KEYED("Keyed"),
    PERCUSSION("Percussion");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
