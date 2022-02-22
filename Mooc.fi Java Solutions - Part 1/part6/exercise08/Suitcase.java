import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> container;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.container = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.maxWeight >= (totalWeight() + item.getWeight())) {
            this.container.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : this.container) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item i : this.container) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (this.container.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.container.get(0);
        for (Item i : this.container) {
            if (i.getWeight() >= heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        if (this.container.size() < 1) {
            return "no items (" + totalWeight() + " kg)";
        } else if (this.container.size() < 2) {
            return this.container.size() + " item (" + totalWeight() + " kg)";
        } else {
            return this.container.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
