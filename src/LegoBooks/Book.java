package LegoBooks;

public class Book {
    protected final String title;
    protected final String author;
    protected final String category;
    protected final boolean isFiction;
    protected final int score;
    protected final String color;
    protected final String owner;


    public Book(String title, String author, String category, boolean isFiction, int score, String color, String owner) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isFiction = isFiction;
        this.score = score;
        this.color = color;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isFiction() {
        return isFiction;
    }

    public int getScore() {
        return score;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }
}
