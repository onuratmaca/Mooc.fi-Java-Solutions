
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard cardPaul = new PaymentCard(20.0);
        PaymentCard cardMatt = new PaymentCard(30.0);

        cardPaul.eatHeartily();;
        cardMatt.eatAffordably();

        System.out.println("Paul: "+cardPaul.toString());
        System.out.println("Matt: "+cardMatt.toString());

        cardPaul.addMoney(20.0);
        cardMatt.eatHeartily();

        System.out.println("Paul: "+cardPaul.toString());
        System.out.println("Matt: "+cardMatt.toString());

        cardPaul.eatAffordably();
        cardPaul.eatAffordably();
        cardMatt.addMoney(50.0);

        System.out.println("Paul: "+cardPaul.toString());
        System.out.println("Matt: "+cardMatt.toString());


        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
