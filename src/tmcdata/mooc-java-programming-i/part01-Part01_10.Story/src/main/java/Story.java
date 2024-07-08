
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");

        // Gets name
        String name = scanner.nextLine();

        System.out.println("What is their job?");

        // Gets job
        String job = scanner.nextLine();

        // Prints story
        System.out.println("Here is the story:");
        System.out.printf("Once upon a time there was %s, who was %s.\r\n" + // name, job
                        "On the way to work, %s reflected on life.\r\n" + // name
                        "Perhaps %s will not be %s forever." // name, job
                        , name, job, name, name, job);
        
        scanner.close();

    }
}
