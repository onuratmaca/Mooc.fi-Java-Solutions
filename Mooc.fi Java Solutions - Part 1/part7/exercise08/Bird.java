public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }

    public void addObservation() {
        this.observationCount++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservationCount() {
        return observationCount;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }


}
