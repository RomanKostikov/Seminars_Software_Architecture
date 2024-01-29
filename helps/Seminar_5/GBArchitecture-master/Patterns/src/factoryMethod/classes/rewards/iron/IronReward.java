package factoryMethod.classes.rewards.iron;

import factoryMethod.interfaces.iRewardItem;

public class IronReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Iron reward");
    }
}
