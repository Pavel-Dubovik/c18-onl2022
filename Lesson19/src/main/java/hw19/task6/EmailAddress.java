package hw19.task6;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EmailAddress {
    private String email;
//    private String someData;

    public EmailAddress(String email) {
        this.email = email;
    }
}
