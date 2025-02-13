package tasks.patterns.builder.report;

public class Chart {
    private final ChartType type;
    private final String description;

    public Chart(ChartType type, String description) {
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ChartType = " + type + "; Description = " + description;
    }
}
