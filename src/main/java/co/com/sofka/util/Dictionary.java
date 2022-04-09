package co.com.sofka.util;

public enum Dictionary {

    EMPTY_STRING(""),
    SPACE_STRING(" "),

    SPANISH_CODE_LANGUAGE("es"),
    COUNTRY_CODE("CO"),

    FILES_DIRECTORY_PATH("src/main/resources/files"),

    JOB_SPECIFICATION_FILE(System.getProperty("user.dir") + "/" + FILES_DIRECTORY_PATH.getValue() + "/jobspecification.PNG");

    private final String value;

    Dictionary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
