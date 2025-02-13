package tasks.patterns.builder.report;

// Use Builder to create report (Report).
// Report should support adding different sections, tables and charts.
// Realise fluent interface (.addSection(), .addTable(), .addChart()).
// Take into account immutable of report after his building.

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Report report = new Report.Builder("Sales analysis")
                .setTitle("Updated sales analysis")
                .setAuthor("Ivan Ivanov")
                .setDateOfCreation(LocalDate.now())
                .addSection("Introduction", "This report contains sales analysis by last year.")
                .addTable(new Table.Builder()
                        .addRow("Month", "Revenue", "Orders amount")
                        .addRow("January", "1000$", "500 orders")
                        .addRow("February", "1200$", "600 orders")
                        .build())
                .addChart(ChartType.BAR, "Продажи по месяцам")
                .build();

        System.out.println(report);
    }
}
