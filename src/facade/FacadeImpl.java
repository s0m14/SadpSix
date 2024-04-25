package facade;

import java.util.List;

public class FacadeImpl implements Facade {
    private BookInventorySystem bookInventorySystem;
    private UserManagementSystem userManagementSystem;

    public FacadeImpl(){
        this.bookInventorySystem = new BookInventorySystem();
        this.userManagementSystem = new UserManagementSystem();
    }

    @Override
    public void borrow(String title, String author) {
        bookInventorySystem.borrowBook(title,author);
    }

    @Override
    public void returnBook(String title, String author) {
        bookInventorySystem.returnBook(title,author);
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return bookInventorySystem.searchByTitle(title);
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return bookInventorySystem.searchByAuthor(author);
    }

    @Override
    public boolean isAvailable(String title, String author) {
        return bookInventorySystem.checkAvailablity(title,author);
    }

    @Override
    public boolean login(String login, String pass) {
        return userManagementSystem.isUser(login,pass);
    }
}
