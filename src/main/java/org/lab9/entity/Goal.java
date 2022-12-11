package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

public class Goal {
    @Getter @Setter private Integer id;
    @Getter @Setter private String name;
    @Getter @Setter private Integer duration;
    @Getter @Setter private Double currentSum;
    @Getter @Setter private Double wishSum;

    public void addMoney(Double money) {
        this.currentSum = this.currentSum + money;
    }

    public Double getRequired() {
        return this.wishSum - this.currentSum;
    }
}
