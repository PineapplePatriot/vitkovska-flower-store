package laboratories;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private final String code;

    FlowerColor(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
