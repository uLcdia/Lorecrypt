import java.util.ArrayList;
import java.util.Comparator;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        return this.persons.stream()
            .min(Comparator.comparingInt(Person::getHeight))
            .orElse(null);
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
