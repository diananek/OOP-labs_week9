package org.lab9;

import org.lab9.entity.TransactionHistory;


public class Main {
    public static void main(String[] args) {
        GsonParser parser = new GsonParser();

        TransactionHistory data = parser.parse();

        System.out.println(data.toString());

        App.run();
    }
}
