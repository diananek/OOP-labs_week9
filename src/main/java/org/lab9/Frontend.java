package org.lab9;
import io.bretty.console.table.Alignment;
import io.bretty.console.table.ColumnFormatter;
import io.bretty.console.table.Precision;
import io.bretty.console.table.Table;
import org.lab9.entity.Transaction;
import org.lab9.entity.TransactionHistory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Frontend {
    public static void showTable(TransactionHistory data) {
        ColumnFormatter<Number> idFormatter = ColumnFormatter.number(Alignment.LEFT, 5,Precision.ZERO);
        ColumnFormatter<Number> categoryFormatter = ColumnFormatter.number(Alignment.RIGHT, 15,Precision.ZERO);
        ColumnFormatter<Number> amountFormatter = ColumnFormatter.number(Alignment.RIGHT, 10, Precision.TWO);
        ColumnFormatter<String> isIncomeFormatter = ColumnFormatter.text(Alignment.RIGHT, 15);
        ColumnFormatter<String> commentFormatter = ColumnFormatter.text(Alignment.RIGHT, 30);

        List<Integer> idList = new ArrayList<>();
        List<Double> amountList = new ArrayList<>();
        List<String> isIncomeList = new ArrayList<>();
        List<Integer> categoryIdList = new ArrayList<>();
        List<String> commentList = new ArrayList<>();

        for (Transaction transaction : data.getTransactions()) {
            idList.add(transaction.getId());
            amountList.add(transaction.getAmount());
            isIncomeList.add(String.valueOf(transaction.getIsIncome()));
            categoryIdList.add(transaction.getCategoryId());
            commentList.add(transaction.getComment());
        }
        Double[] amountArr = new Double[amountList.size()];
        amountArr = amountList.toArray(amountArr);

        Integer[] idArr = new Integer[idList.size()];
        idArr = idList.toArray(idArr);

        String[] isIncomeArr = new String[isIncomeList.size()];
        isIncomeArr = isIncomeList.toArray(isIncomeArr);

        Integer[] categoryIdArr = new Integer[categoryIdList.size()];
        categoryIdArr = categoryIdList.toArray(categoryIdArr);

        String[] commentArr = new String[commentList.size()];
        commentArr = commentList.toArray(commentArr);

        Table.Builder builder = new Table.Builder("Id", idArr, idFormatter);

        builder.addColumn("Amount", amountArr, amountFormatter);
        builder.addColumn("Is income flag", isIncomeArr, isIncomeFormatter);
        builder.addColumn("Category id", categoryIdArr, categoryFormatter);
        builder.addColumn("Comment", commentArr, commentFormatter);

        Table table = builder.build();
        System.out.println(table);
    }
}
