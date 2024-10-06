
public class HealthStation {
    private int weighingCount = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        if (person != null) {
            this.weighingCount++;
            return person.getWeight();
        }
        return -1;
    }

    public void feed(Person person) {
        if (person != null) {
            person.setWeight(person.getWeight() + 1);
        }
    }

    public int weighings() {
        return this.weighingCount;
    }

}
