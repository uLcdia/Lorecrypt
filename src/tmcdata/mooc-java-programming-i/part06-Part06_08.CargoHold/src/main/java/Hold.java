import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private final int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        return this.suitcases.stream()
            .mapToInt(Suitcase::totalWeight).sum();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() > maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }

    public void printItems() {
        this.suitcases.forEach(Suitcase::printItems);
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases ("
             + this.totalWeight() + " kg)";
    }
}
