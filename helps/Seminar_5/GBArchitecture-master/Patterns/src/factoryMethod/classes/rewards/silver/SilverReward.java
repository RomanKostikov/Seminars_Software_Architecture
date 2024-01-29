package factoryMethod.classes.rewards.silver;

import factoryMethod.interfaces.iRewardItem;

public class SilverReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Silver reward");
    }
}
