import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int totalWeight() {
        return this.items.stream()
            .mapToInt(Item::getWeight).sum();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() > maxWeight) {
            return;
        }
        this.items.add(item);
    }

    public void printItems() {
        this.items.forEach(System.out::println);
    }

    public Item heaviestItem() {
        return this.items.stream()
            .max(Comparator.comparingInt(Item::getWeight))
            .orElse(null);
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.items.size()
            + (this.items.size() == 1 ? " item " : " items ")
            + this.totalWeight() + " kg";
    }
}
