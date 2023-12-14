package classObjectDataEncapsulation;

public enum Season {
    SPRING("MÙA XUÂN"), SUMMER("MÙA HẠ"), FALL("MÙA THU"), WINTER("MÙA ĐÔNG");

    Season(String name) {
        value = name;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
