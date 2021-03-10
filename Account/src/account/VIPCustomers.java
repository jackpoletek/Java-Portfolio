package account;

public class VIPCustomers extends Reward {

    private String name;
    private double creditLimit;
    private double balance;
    private double reward;
    private double depositAmount;

    Reward rew = new Reward();

    public VIPCustomers(String name, double depositAmount, double creditLimit) {
        this.name = name;
        this.depositAmount = depositAmount;
        this.creditLimit = creditLimit;
    }

    public double rewardGranted(double depositAmount, double creditLimit, Rewarded rewarded) {

        if (rewarded.rewardQualifications(depositAmount, creditLimit)) {
            reward = 3000.00;
        }
        return reward;
    }

    public void rewardNotification() {

        double showReward = rewardGranted(depositAmount, creditLimit, rew);

        if(depositAmount < 2000.00 || creditLimit <= 4000.00) {
            System.out.println("You haven't qualified for the reward.");
        } else {
            System.out.println("You've received a reward!");
            System.out.println(reward + " has been credited to your account.");
        }
    }

    public String getName() {
        return name;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getReward() {
        return reward;
    }
}
