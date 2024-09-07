
import java.util.Scanner;
import java.util.HashMap;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> userCredentials = new HashMap<>();

        userCredentials.put("alex", "sunshine");
        userCredentials.put("emma", "haskell");

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
