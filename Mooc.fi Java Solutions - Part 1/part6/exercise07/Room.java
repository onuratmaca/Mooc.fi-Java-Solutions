import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    // public void add(Person person) - add the person passed as a paramter to the list.
    // public boolean isEmpty() - returns a boolean-type value true or false,
    // that tells whether the room is empty or not.
    // public ArrayList<Person> getPersons() - returns a list of the persons in the room.

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return (this.people.isEmpty());
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.people.get(0);

        for (Person p : this.people) {
            if (shortestPerson.getHeight() > p.getHeight()) {
                shortestPerson = p;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        Person p = shortest();
        this.people.remove(p);
        return p;
    }

}
