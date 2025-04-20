package patterns.builder.RevenueReport;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
public class Table {
    private final List<TableRow> rows = new ArrayList<>();

    public Table addRow(String... cells) {
        rows.add(new TableRow(List.of(cells)));
        return this;
    }
}
