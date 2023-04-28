package by.tms.myshop.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {

    private String name;
    private String password;
}