import java.util.Scanner;
import java.util.ArrayList;

public class IOManager {
    private final Scanner scanner;

    public IOManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public ArrayList<Book> getBooksInput() {
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        return books;
    }

    public void print(ArrayList<Book> books, PrintOptions option) {
        switch (option) {
            case EVERYTHING:
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            
            case NAME:
                for (Book book : books) {
                    System.out.println(book.getTitle());
                }
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public PrintOptions getPrintOption() {
        System.out.println("What information will be printed?");

        String option = scanner.nextLine().trim().toUpperCase();

        try {
            return PrintOptions.valueOf(option);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid option (EVERYTHING or NAME), defaulting to EVERYTHING");
            return PrintOptions.EVERYTHING;
        }
    }
}
