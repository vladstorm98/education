package oop.basic.lesson7;

public class Book {
    String name;
    String author;
    int pages;
    boolean isDocumentary;

    public Book(String name, String author, int pages, boolean isDocumentary) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isDocumentary = isDocumentary;
    }

    public void printCountRows() {
        System.out.printf("Общее количество строк: %d.\n", this.pages * 40);
    }

    public void printCountRows(int countRowsOnPage) {
        System.out.printf("Общее количество строк: %d.\n", this.pages * countRowsOnPage);
    }

    public void printInformation() {
        System.out.printf("Книга '%s' от писателя %s - %s\n",
                this.name, this.author, this.isDocumentary ? "Документальная" : "Не документальная");
        printCountRows();
    }
}
