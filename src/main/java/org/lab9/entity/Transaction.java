package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Transaction {
    @Getter @Setter private Integer id;
    @Getter @Setter private Double amount;
    @Getter @Setter private Boolean isIncome;
    @Getter @Setter private Date date;
    @Getter @Setter private Integer categoryId;
    @Getter @Setter private String comment;


    public String toString()
    {
        return id + " " + amount + " " + isIncome + " "
                + categoryId + " " + comment;
    }
}
