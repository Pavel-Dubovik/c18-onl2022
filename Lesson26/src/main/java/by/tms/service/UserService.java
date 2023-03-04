package by.tms.service;

import lombok.Getter;

import java.util.Map;

public class UserService {
    @Getter
    private Map<String, String> users;

    public UserService(Map<String, String> users) {
        this.users = users;
    }

    /*private Map<String, String> getUsers() {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "123123");
        users.put("guest", "1111");

        return users;
    }*/

    public boolean checkAuthorization(Object login, Object password) {
        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getKey().equals(login) && entry.getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
