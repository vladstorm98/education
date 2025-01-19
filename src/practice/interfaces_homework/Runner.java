package practice.interfaces_homework;

public class Runner {
    public static void main(String[] args) {
        Spruce spruce = new Spruce();
        spruce.smell();
        spruce.hasCones();

        Pine pine = new Pine();
        pine.hasCones();
        pine.smell();

        Fern fern = new Fern();
        fern.blossom();

        Rose rose = new Rose();
        rose.blossom();
        rose.smell();
    }
}
