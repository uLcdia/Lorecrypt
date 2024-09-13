
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class PrintingAFile {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("data.txt"))
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
