package by.tms.model;

import lombok.Getter;

@Getter
public class User {
    private String login;
    private String password;

    {
        login = "test";
        password = "1111";
    }
}
