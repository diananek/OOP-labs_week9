package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionHistory {
    @Getter @Setter private ArrayList<Transaction> transactions;

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    public Transaction findTransactionById(Integer id) {
        for (Transaction transaction : this.transactions) {
            if (transaction.getId().equals(id)) {
                return transaction;
            }
        }
        return null;
    }
    public void removeTransactionById(Integer id) {
        Transaction transaction = this.findTransactionById(id);
        this.transactions.remove(transaction);
    }
    public String toString() {
        Stream<Transaction> st = this.transactions.stream();
        String result = st.map(Transaction::toString).collect(Collectors.joining("\n"));;
        return result;
    }
}
