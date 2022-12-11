package org.lab9;
import io.bretty.console.table.Alignment;
import io.bretty.console.table.ColumnFormatter;
import io.bretty.console.table.Precision;
import io.bretty.console.table.Table;

public class Frontend {
    public static void showTable() {
        ColumnFormatter<String> nameFormatter = ColumnFormatter.text(Alignment.LEFT, 30);
        ColumnFormatter<Number> ageFormatter = ColumnFormatter.number(Alignment.RIGHT, 10, Precision.ZERO);
        ColumnFormatter<Number> rateFormatter = ColumnFormatter.percentage(Alignment.RIGHT, 10, Precision.ONE);

// create a builder with the first column
// "Name" serves as the header for this column
        String[] names = {"diana", "andrew", "michael"};
        Table.Builder builder = new Table.Builder("Name", names, nameFormatter);

// add other columns
        Integer[] ages = {1, 2, 3};
        Integer[] rates = {10, 20, 30};

        builder.addColumn("Age", ages, ageFormatter);
        builder.addColumn("Rate", rates, rateFormatter);

// build the table and print it
        Table table = builder.build();
        System.out.println(table); // NOTICE: table.toString() is called implicitly
    }
}
