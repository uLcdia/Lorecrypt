import java.util.ArrayList;
import java.util.stream.Collectors;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        String elementsString = elements.stream()
            .map(element -> element.toString())
            .collect(Collectors.joining("\n"));
        if (elements.size() == 1) {
            return "The collection " + name + " has " + elements.size() + " element:\n" + elementsString;
        }
        return "The collection " + name + " has " + elements.size() + " elements:\n" + elementsString;
    }
    
}
