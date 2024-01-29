package factoryMethod.classes.rewards.iron;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class IronGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new IronReward();
    }
}
