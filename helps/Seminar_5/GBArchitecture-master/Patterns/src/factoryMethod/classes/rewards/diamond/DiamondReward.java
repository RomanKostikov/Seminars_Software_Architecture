package factoryMethod.classes.rewards.diamond;

import factoryMethod.interfaces.iRewardItem;

public class DiamondReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Diamond reward");
    }
}
