package by.tms.myshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@AllArgsConstructor
public enum Command {

    HOME_COMMAND("home"),
    CATEGORY_COMMAND("category"),
    PRODUCT_COMMAND("product"),
    CART_COMMAND_GET("cart-get"),
    CART_COMMAND_POST("cart-post");

    public static final Map<String, Command> COMMAND_MAP = new HashMap<>();

    static {
        for (Command type : values()) {
            COMMAND_MAP.put(type.getCOMMAND(), type);
        }
    }

    private final String COMMAND;

    public static Command fromString(String type) {
        return Optional.ofNullable(COMMAND_MAP.get(type))
                .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }
}