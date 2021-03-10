package account;

public class Main {

    public static void main(String[] args) {

        BankAccount jamesAccount = new BankAccount("107849", 0.00, "James Cameron",
                "james@titanic.co.uk","(0044) 657 234 654");
        jamesAccount.deposit(300);
        jamesAccount.withdraw(100);

        BankAccount waynesAccount = new BankAccount("Wayne", "wayne@hotmail.com", "2345678");
        System.out.println("Your account number is "+ waynesAccount.getAccountNumber() + " and your balance is " + waynesAccount.getBalance());

        VIPCustomers billy = new VIPCustomers("Bill", 2500,4500);
        billy.rewardNotification();
    }
}
