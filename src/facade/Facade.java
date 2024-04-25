package facade;

import java.util.List;

public interface Facade {
    void borrow(String title, String author);
    void returnBook(String title,String author);
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    boolean isAvailable(String title,String author);
    boolean login(String login,String password);
}
