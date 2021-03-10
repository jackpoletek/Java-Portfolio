package account;

public class Reward implements Rewarded {

    @Override
    public boolean rewardQualifications(double deposit, double credit) {
        return true;
    }
}
