import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    // A parameterless constructor
    // Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package.
    // Method public int totalWeight(), which returns the total weight of the package's gifts.

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift g : this.gifts) {
            totalWeight += g.getWeight();
        }
        return totalWeight;
    }


}
