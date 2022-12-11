package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter private Integer id;
    @Getter @Setter private String name;
    @Getter @Setter private String lang;
    @Getter @Setter private String mainCurrency;

    public void login() {
        System.out.println(this.name + "login");
    }
    public void logout() {
        System.out.println(this.name + "logout");
    }
}
