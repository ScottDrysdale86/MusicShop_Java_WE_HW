public enum GuitarType {
    ELECTRICGUITAR("Electric"),
    ACOUSTICGUITAR("Acoustic"),
    BASSGUITAR("Bass");
    private final String type;

    GuitarType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
