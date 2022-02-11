public class Counter {
    // Implement a class called Counter
    // The class contains a number whose value can be incremenented and decremented.
    private int value;
    // The class must have the following constructors:
    //public Counter(int startValue) sets the start value of the counter to startValue.
    //public Counter() sets the start value of the counter to 0.

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    // And the following methods:
    //public int value() returns the current value of the counter
    //public void increase() increases the value by 1
    //public void decrease() decreases the value by 1
    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    // Implement versions which are given one parameter of the methods increase and decrease.
    //public void increase(int increaseBy) increases the value of the counter by the value of increaseBy.
    //If the value of increaseBy is negative, the value of the counter does not change.
    //public void decrease(int decreaseBy) decreases the value of the counter by the value of decreaseBy.
    //If the value of decreaseBy is negative, the value of the counter does not change.
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

}
