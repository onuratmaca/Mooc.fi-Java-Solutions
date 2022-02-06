
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MatthewsAccount = new Account("Matthews account", 1000);
        Account MyAccount = new Account("My account", 0);
        MatthewsAccount.withdrawal(100);
        MyAccount.deposit(100);

        System.out.println(MatthewsAccount);
        System.out.println(MyAccount);
    }
}
