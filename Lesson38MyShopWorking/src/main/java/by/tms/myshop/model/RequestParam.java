package by.tms.myshop.model;

public enum RequestParam {

    LOGIN("username"),
    PASSWORD("password"),
    COMMAND("command");

    private final String value;

    RequestParam(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
