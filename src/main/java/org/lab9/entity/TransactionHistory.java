package org.lab9.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionHistory implements History<Transaction> {
    @Getter @Setter private List<Transaction> transactions;
    @Override
    public void addOperation(Transaction transaction) {
        this.transactions.add(transaction);
    }


    public Transaction findOperationById(Integer id) {
        for (Transaction transaction : this.transactions) {
            if (transaction.getId().equals(id)) {
                return transaction;
            }
        }
        return null;
    }
    public void removeOperationById(Integer id) {
        Transaction transaction = this.findOperationById(id);
        this.transactions.remove(transaction);
    }

    @Override
    public String toString() {
        Stream<Transaction> st = this.transactions.stream();
        String result = st.map(Transaction::toString).collect(Collectors.joining("\n"));
        return result;
    }
}
