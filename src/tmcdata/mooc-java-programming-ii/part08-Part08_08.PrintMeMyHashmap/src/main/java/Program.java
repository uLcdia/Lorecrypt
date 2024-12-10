
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        hashmap.keySet()
                .stream()
                .forEach(System.out::println);
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        hashmap.keySet()
                .stream()
                .filter(key -> key.contains(text))
                .forEach(System.out::println);
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        hashmap.keySet()
                .stream()
                .filter(key -> key.contains(text))
                .forEach(key -> System.out.println(hashmap.get(key)));
    }
    
}
