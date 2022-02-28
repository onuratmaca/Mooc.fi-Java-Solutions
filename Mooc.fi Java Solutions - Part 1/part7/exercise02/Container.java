import java.util.ArrayList;

public class Container {
    private int container;
    private final short MAX_CAPACITY = 100;

    public Container() {
        this.container = 0;
    }

    public int contains() {
        return this.container;
    }

    public short getCapacity() {
        return MAX_CAPACITY;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.container + amount <= MAX_CAPACITY) {
                this.container += amount;
            } else {
                this.container = MAX_CAPACITY;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.container - amount >= 0) {
                this.container -= amount;
            } else {
                this.container = 0;
            }
        }
    }

    public String toString() {
        return this.container + "/" + MAX_CAPACITY;
    }
}
