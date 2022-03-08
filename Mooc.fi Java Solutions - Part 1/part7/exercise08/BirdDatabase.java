import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birds.add(bird);
    }

    public void printAll() {
        for (Bird b : this.birds) {
            System.out.println(b.toString());
        }
    }

    public void printOne(String name) {
        for (Bird b : this.birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.println(b.toString());
            }
        }
    }

    public boolean isItABird(String name) {
        for (Bird b : this.birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void addOneObservation(String name) {
        if (isItABird(name)) {
            for (Bird b : this.birds) {
                if (b.getName().equalsIgnoreCase(name)) {
                    b.addObservation();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }
}
