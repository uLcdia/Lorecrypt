import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.owners.containsKey(licensePlate)) {
            return false;
        }

        this.owners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.owners.containsKey(licensePlate)) {
            this.owners.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        this.owners.keySet().forEach(System.out::println);
    }

    public void printOwners() {
        this.owners.values().stream().distinct().forEach(System.out::println);
    }
}
