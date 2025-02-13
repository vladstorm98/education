package tasks.patterns.builder.report;

public class Section {
    private final String title;
    private final String content;

    public Section(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Title: " + title + "; Content: " + content;
    }
}
