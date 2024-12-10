public class Container {
    private int amount;
    private static final int MAX_AMOUNT = 100;

    public Container(int amount) {
        this.amount = amount;
    }

    public Container() {
        this(0);
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        int amountSum = this.amount + amount;
        
        if (amount < 0) {
            return;
        }

        if (amountSum > MAX_AMOUNT) {
            this.amount = MAX_AMOUNT;
        } else {
            this.amount = amountSum;
        }
    }

    public void remove(int amount) {
        if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }

    public void move(Container container, int amount) {
        int amountMoved = this.amount;
        this.remove(amount);
        amountMoved -= this.amount;
        container.add(amountMoved);
    }

    @Override
    public String toString() {
        return this.amount + "/" + MAX_AMOUNT;
    }
}
