package org.lab9;

import org.lab9.entity.TransactionHistory;

import java.io.FileReader;

public class App {
    public static void run() {
        try(FileReader reader = new FileReader("src/main/java/org/lab9/transactions2.json")) {
            GsonParser parser = new GsonParser();
            TransactionHistory data = parser.parse(reader);
            Frontend.showTable(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
