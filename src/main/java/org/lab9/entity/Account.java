package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Account {
    @Getter @Setter private Integer id;
    @Getter @Setter private Double currentSum;
    @Getter @Setter private String currency;
    @Getter @Setter private String name;

    public void addMoney(Double sum){
        this.currentSum += sum;
    }
    public void removeMoney(Double sum){
        this.currentSum -= sum;
    }
}
