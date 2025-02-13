package tasks.patterns.builder.report;

import java.util.List;

public class TableRow {
    private final List<String> cells;

    public TableRow(List<String> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return "Cells: " + cells;
    }
}
