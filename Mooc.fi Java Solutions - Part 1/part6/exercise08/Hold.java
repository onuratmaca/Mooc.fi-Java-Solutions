import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holder;

    public Hold(int maxWeight) {
        this.holder = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight >= totalWeight() + suitcase.totalWeight()) {
            this.holder.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase s : this.holder) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase s : this.holder) {
            s.printItems();
        }
    }

    public String toString() {
        return this.holder.size() + " suitcases (" + totalWeight() + " kg)";
    }


}
