package factoryMethod.classes.rewards.platinum;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class PlatinumGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new PlatinumReward();
    }
}
