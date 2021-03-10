package account;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String clientName;
    private String clientEmailAddress;
    private String clientPhoneNumber;

    // this constructor is calling the one underneath it
    public BankAccount() {
        this("66666", 5.00, "Default name", "Default e-mail address", "Default phone number");
    }

    public BankAccount(String accountNumber, double balance, String clientName, String clientEmailAddress, String clientPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientName = clientName;
        this.clientEmailAddress = clientEmailAddress;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public BankAccount(String clientName, String clientEmailAddress, String clientPhoneNumber) {
        this("554433", 200.00, clientName, clientEmailAddress, clientPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;

        System.out.println("You have deposited " + depositAmount);
        System.out.println("Your new balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {

        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Not enough funds.");
            System.out.println("Your current balance is " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount);
            System.out.println("Your new balance is " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String name) {
        this.clientName = name;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    public void setClientEmailAddress(String email) {
        this.clientEmailAddress = email;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String phoneNumber) {
        this.clientPhoneNumber = phoneNumber;
    }
}

