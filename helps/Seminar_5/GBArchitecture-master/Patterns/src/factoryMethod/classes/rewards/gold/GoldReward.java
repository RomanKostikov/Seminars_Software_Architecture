package factoryMethod.classes.rewards.gold;

import factoryMethod.interfaces.iRewardItem;

public class GoldReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Gold reward");
    }
}
