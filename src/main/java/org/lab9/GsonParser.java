package org.lab9;

import java.io.FileReader;

import com.google.gson.Gson;
import org.lab9.entity.TransactionHistory;

public class GsonParser {
    public TransactionHistory parse() {
        Gson gson = new Gson();

        try(FileReader reader = new FileReader("src/main/java/org/lab9/transactions2.json")) {
            TransactionHistory data = gson.fromJson(reader, TransactionHistory.class);

            return data;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
