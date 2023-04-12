package by.tms.myshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RequestParam {

    LOGIN("username"),
    PASSWORD("password"),
    COMMAND("command");

    private final String VALUE;
}