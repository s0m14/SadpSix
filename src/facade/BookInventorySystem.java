package facade;

import java.util.ArrayList;
import java.util.List;

public class BookInventorySystem {
    List<Book> books;
    Book book;

    public BookInventorySystem(){
        this.books = new ArrayList<>();
        books.add(new Book("1984","George Orwell"));
        books.add(new Book("Don Quixote","Miguel de Cervantes"));
        books.add(new Book("Abay Zholy","Mukhtar Auezov"));
        books.add(new Book("Animal farm","George Orwell"));
        books.add(new Book("Kokserek","Mukhtar Auezov"));
    }

    public void addBook(String title,String author){
        books.add(new Book(title, author));
    }

    public List<Book> searchByTitle(String title){
        List<Book> res = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle() == title){
                res.add(book);
            }
        }
        return res;
    }

    public List<Book> searchByAuthor(String author){
        List<Book> res = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor() == author){
                res.add(book);
            }
        }
        return res;
    }

    public void borrowBook(String title,String author){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && book.isAvailable()){
                book.setAvailable(false);
                System.out.println("Book " + title + " borrowed" );
                return;
            }
        }
        System.out.println("Book " + title + " is not available");
    }

    public void returnBook(String title,String author){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author) && !book.isAvailable()){
                book.setAvailable(true);
                System.out.println("Book " + title + "  returned");
                return;
            }
        }
        System.out.println("Invalid book title or author");
    }

    public boolean checkAvailablity(String title,String author){
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}