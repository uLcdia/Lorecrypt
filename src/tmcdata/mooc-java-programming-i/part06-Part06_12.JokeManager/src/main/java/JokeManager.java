import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class JokeManager {
    private ArrayList<String> jokeList;

    public JokeManager() {
        jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke() {
        if (jokeList == null || jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(jokeList.size());
        return jokeList.get(randomIndex);
    }
    
    public void printJokes() {
        jokeList.stream().forEach(System.out::println);
    }
}
