package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Category {
    @Getter @Setter private Integer id;
    @Getter @Setter private String name;
    @Getter @Setter private Boolean isIncome;
}
