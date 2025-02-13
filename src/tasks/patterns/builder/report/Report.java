package tasks.patterns.builder.report;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {
    private final String title;
    private final String author;
    private final LocalDate dateOfCreation;
    private final List<Section> sections;
    private final List<Table> tables;
    private final List<Chart> charts;

    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.dateOfCreation = builder.dateOfCreation;
        this.sections = builder.sections;
        this.tables = builder.tables;
        this.charts = builder.charts;
    }

    static class Builder {
        private String title;
        private String author;
        private LocalDate dateOfCreation;
        private final List<Section> sections = new ArrayList<>();
        private final List<Table> tables = new ArrayList<>();
        private final List<Chart> charts = new ArrayList<>();

        public Builder(String title) {
            this.title = title;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDateOfCreation(LocalDate localDate) {
            this.dateOfCreation = localDate;
            return this;
        }

        public Builder addSection(String title, String content) {
            this.sections.add(new Section(title, content));
            return this;
        }

        public Builder addTable(Table table) {
            this.tables.add(table);
            return this;
        }

        public Builder addChart(Chart chart) {
            this.charts.add(chart);
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

    @Override
    public String toString() {
        return "Report:" +
                "\n    title = " + title +
                ";\n    author = " + author +
                ";\n    dateOfCreation = " + dateOfCreation +
                ";\n    sections = " + sections +
                ";\n    tables = " + tables +
                ";\n    charts = " + charts + ".";
    }
}

