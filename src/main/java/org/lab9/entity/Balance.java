package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Balance {
    @Getter @Setter private Integer id;
    @Getter @Setter private Integer incomeCategoryId;
    @Getter @Setter private Double currentSum;
    @Getter @Setter private String currency;
    @Getter @Setter private String name;
    @Getter @Setter private Double percent;

    public void addMoney(Double sum){
        this.currentSum += sum;
    }
    public void removeMoney(Double sum){
        this.currentSum -= sum;
    }
}
