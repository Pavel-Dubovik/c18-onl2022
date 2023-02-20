package by.tms.service;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> getUsers() {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "123123");
        users.put("guest", "1111");

        return users;
    }

    public boolean authorization(Object login, Object password) {
        for (Map.Entry<String, String> entry : getUsers().entrySet()) {
            if (entry.getKey().equals(login) && entry.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
