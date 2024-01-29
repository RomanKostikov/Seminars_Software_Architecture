package factoryMethod.classes.rewards.platinum;

import factoryMethod.interfaces.iRewardItem;

public class PlatinumReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Platinum reward");
    }
}
