public class Gauge {
    private int value;

    public Gauge() {
        value = 0;
    }

    public Gauge(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public boolean full() {
        return this.value == 5;
    }
}
