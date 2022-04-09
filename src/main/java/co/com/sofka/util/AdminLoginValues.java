package co.com.sofka.util;

public enum AdminLoginValues {

    USERNAME("Admin"),
    PASSWORD("admin123");

    private final String value;

    AdminLoginValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
