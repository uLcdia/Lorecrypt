
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        // You'll need jdk11 from now on to run the TMC test

        Account myAccount = new Account("Max Caulfield", 100);
        myAccount.deposit(20);
        System.out.println(myAccount);

    }
}
