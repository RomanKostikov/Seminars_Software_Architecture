package factoryMethod.classes.rewards.silver;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class SilverGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new SilverReward();
    }
}
