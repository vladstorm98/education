package patterns.builder.RevenueReport;

import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString
public class RevenueReport {
    private final String title;
    private final String author;
    private final LocalDate dateOfCreation;
    private final List<Section> sections;
    private final List<Table> tables;
    private final List<Chart> charts;

    private RevenueReport(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.dateOfCreation = builder.dateOfCreation;
        this.sections = builder.sections;
        this.tables = builder.tables;
        this.charts = builder.charts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String author;
        private LocalDate dateOfCreation;
        private final List<Section> sections = new ArrayList<>();
        private final List<Table> tables = new ArrayList<>();
        private final List<Chart> charts = new ArrayList<>();

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

        public Builder addChart(ChartType type, String description) {
            this.charts.add(new Chart(type, description));
            return this;
        }

        public RevenueReport build() {
            return new RevenueReport(this);
        }
    }
}

