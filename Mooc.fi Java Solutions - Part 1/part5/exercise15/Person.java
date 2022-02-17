public class Person {
    private String identifier;
    private String name;

    public Person(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        return this.identifier.equals(comparedPerson.identifier);
    }
}
