
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printSingle = "The collection " + this.name + " has " + getElements().size() + " element:";
        String printMulti = "The collection " + this.name + " has " + getElements().size() + " elements:";

        if (getElements().isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String letters = "";

        for (String l : getElements()) {
            if (getElements().size() < 2) {
                letters += l;
            } else {
                letters += l + "\n";
            }
        }

        if (getElements().size() == 1) {
            return printSingle + "\n" + letters;
        }


        return printMulti + "\n" + letters;
    }

}
