package facade;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FacadeImpl facade = new FacadeImpl();
        System.out.println("Welcome to our library system! Please log in!");
        System.out.print("Login:");
        Scanner in = new Scanner(System.in);
        String login = in.next();
        System.out.print("Password:");
        String pass = in.next();
        if(facade.login(login,pass)){
            System.out.println("You logged successfully");
            List<Book> searchByTitle = facade.searchByTitle("1984");
            if(!searchByTitle.isEmpty())
            for(Book book: searchByTitle ){
                System.out.println(book.getTitle() + " " + book.getAuthor());
            }else
                System.out.println("Books not found by title");

            List<Book> searchByAuthor = facade.searchByAuthor("Mukhtar Auezov");
            if(!searchByAuthor.isEmpty())
            for(Book book : searchByAuthor){
                System.out.println(book.getTitle() + " " + book.getAuthor());
            }else
                System.out.println("Books not found by author");

            boolean available = facade.isAvailable("Crime and Punishment","Fedor Dostoyevsky");
            if(available)
                System.out.println("Book Crime and Punisment is available");
            else
                System.out.println("Not available");

            System.out.println("Borrowing a book....");
            facade.borrow("1984","George Orwell");
            System.out.println(facade.isAvailable("1984","George Orwell"));
            System.out.println("Returning a book");
            facade.returnBook("1984","George Orwell");
            System.out.println(facade.isAvailable("1984","George Orwell"));
        }else{
            System.out.println("Incorrect login");
        }

    }

}

