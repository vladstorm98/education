package patterns.builder.RevenueReport;

// Use Builder to create report (RevenueReport).
// RevenueReport should support adding different sections, tables and charts.
// Realise fluent interface (.addSection(), .addTable(), .addChart()).
// Take into account immutable of report after his building.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RevenueReport report = RevenueReport.builder()
                .setTitle("Sales analysis")
                .setAuthor("Ivan Ivanov")
                .setDateOfCreation(LocalDate.now())
                .addSection("Introduction", "This report contains sales analysis by last year.")
                .addTable(new Table()
                        .addRow("Month", "Revenue", "Orders amount")
                        .addRow("January", "1000$", "500 orders")
                        .addRow("February", "1200$", "600 orders"))
                .addChart(ChartType.BAR, "Sales by month")
                .build();

        System.out.println(report);
    }
}
