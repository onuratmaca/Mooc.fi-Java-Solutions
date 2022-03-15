import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registrar; // License Plate Number, Owner

    public VehicleRegistry() {
        this.registrar = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registrar.containsKey(licensePlate)) {
            this.registrar.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.registrar.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registrar.containsKey(licensePlate)) {
            this.registrar.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate lp : this.registrar.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (String o : this.registrar.values()) {
            if(!list.contains(o)){
                list.add(o);
            }
        }
        for(String o : list){
            System.out.println(o);
        }
    }
}
