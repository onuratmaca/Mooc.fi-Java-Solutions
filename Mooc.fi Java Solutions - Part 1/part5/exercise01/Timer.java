public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundredthsOfSeconds.advance();
        if (this.hundredthsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds.toString() + ":" + hundredthsOfSeconds.toString();
    }
}
