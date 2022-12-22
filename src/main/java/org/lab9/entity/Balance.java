package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Balance extends Account{
    @Getter @Setter private Integer incomeCategoryId;
    @Getter @Setter private Double percent;

    public void addMoney(Double sum){
        this.setCurrentSum(this.getCurrentSum() + sum);
    }
    public void removeMoney(Double sum){
        this.setCurrentSum(this.getCurrentSum() - sum);
    }
}
