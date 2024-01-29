package factoryMethod;

import factoryMethod.classes.rewards.RewardGiver;

public class Main {
    public static void main(String[] args) {
        RewardGiver rewardGiver = new RewardGiver();

        for (int i = 0; i < 20; i++) {
            rewardGiver.giveReward();
        }

    }
}
