package org.lab9;

import java.io.FileReader;

import com.google.gson.Gson;
import org.lab9.entity.TransactionHistory;

public class GsonParser {
    public TransactionHistory parse(FileReader reader) {
        Gson gson = new Gson();

        try {
            return gson.fromJson(reader, TransactionHistory.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
