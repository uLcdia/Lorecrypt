import java.util.ArrayList;

public class Database {
    private ArrayList<Entry> entries;

    public Database() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    public boolean observe(String name) {
        for (Entry entry : this.entries) {
            if (entry.getName().equals(name)) {
                entry.addObservation();
                return true;
            }
        }
        return false;
    }

    public ArrayList<Entry> getEntries() {
        return this.entries;
    }

    public Entry getEntry(String name) {
        for (Entry entry : this.entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }
}
