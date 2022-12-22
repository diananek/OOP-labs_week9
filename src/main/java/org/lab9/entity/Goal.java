package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Goal extends Account{
    @Getter @Setter private Integer duration;
    @Getter @Setter private Double wishSum;

    public void addMoney(Double money) {
        this.setCurrentSum(this.getCurrentSum() + money);
    }

    public Double getRequired() {
        return this.wishSum - this.getCurrentSum();
    }
}
