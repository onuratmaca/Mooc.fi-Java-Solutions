public class Container {
    private int currentCapacity;


    public Container() {
        this.currentCapacity = 0;
    }

    public int contains() {
        return this.currentCapacity;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.currentCapacity += amount;
            if (this.currentCapacity > 100) {
                this.currentCapacity = 100;
            }
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            this.currentCapacity -= amount;
            if (this.currentCapacity < 0) {
                this.currentCapacity = 0;
            }
        }
    }

    public String toString() {
        return this.currentCapacity + "/100";
    }
}
