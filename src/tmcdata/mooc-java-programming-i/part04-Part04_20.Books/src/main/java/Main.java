import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        IOManager ioManager = new IOManager(scanner);
        ArrayList<Book> books = ioManager.getBooksInput();

        ioManager.print(books, ioManager.getPrintOption());

        scanner.close();
    }
}
