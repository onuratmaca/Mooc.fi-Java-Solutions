
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros()) {
            return (this.cents() < compared.cents());
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros(), this.cents());
        if (newMoney.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            int e = newMoney.euros() - decreaser.euros();
            if (e < 0) {
                e = 0;
            }
            int c = newMoney.cents() - decreaser.cents();
            if (c < 0) {
                c = 100 - Math.abs(c);
                e--;
            }
            return new Money(e, c);
        }
        /*
        if (this.euros() - decreaser.euros() <= 0) {
            if (this.cents < decreaser.cents) {
                return new Money(0, 0);
            } else {
                return new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());
            }
        } else {
            return new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());
        }
        */

    }
}
