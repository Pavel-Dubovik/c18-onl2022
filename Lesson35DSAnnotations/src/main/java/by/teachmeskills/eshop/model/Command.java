package by.teachmeskills.eshop.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Command {

    HOME_COMMAND("home"),
    CATEGORY_COMMAND("category"),
    PRODUCT_COMMAND("product"),
    CART_COMMAND_GET("cart-get"),
    CART_COMMAND_POST("cart-post");

    public static final Map<String, Command> commandMapping = new HashMap<>();

    static {
        for (Command type : values()) {
            commandMapping.put(type.getCommand(), type);
        }
    }

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public static Command fromString(String type) {
        return Optional.ofNullable(commandMapping.get(type))
                .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }

    public String getCommand() {
        return command;
    }
}