package factoryMethod.classes.rewards.bronze;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class BronzeReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Bronze reward");
    }
}
