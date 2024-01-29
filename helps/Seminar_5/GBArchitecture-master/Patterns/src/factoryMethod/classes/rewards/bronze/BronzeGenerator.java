package factoryMethod.classes.rewards.bronze;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class BronzeGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new BronzeReward();
    }
}
