package facade;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
