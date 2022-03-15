import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debtTracker;

    public IOU() {
        this.debtTracker = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtTracker.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String name : this.debtTracker.keySet()) {
            if (this.debtTracker.containsKey(toWhom)) {
                return this.debtTracker.getOrDefault(toWhom, 0.0);
            }
        }
        return 0;
    }

}
