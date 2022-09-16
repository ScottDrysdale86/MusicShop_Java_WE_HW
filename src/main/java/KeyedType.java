public enum KeyedType {
    PIANO("Piano"),
    KEYBOARD("Keyboard");
    private final String type;

    KeyedType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
