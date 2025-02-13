package tasks.patterns.builder.report;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<TableRow> rows;

    public Table(Builder builder) {
        this.rows = builder.rows;
    }

    static class Builder {
        private final List<TableRow> rows = new ArrayList<>();

        public Builder addRow(String... cells) {
            this.rows.add(new TableRow(List.of(cells)));
            return this;
        }

        public Table build() {
            return new Table(this);
        }
    }

    @Override
    public String toString() {
        return "Table: " + rows;
    }
}
