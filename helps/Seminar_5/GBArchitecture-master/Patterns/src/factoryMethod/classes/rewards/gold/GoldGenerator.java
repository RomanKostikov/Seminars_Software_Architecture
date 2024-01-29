package factoryMethod.classes.rewards.gold;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class GoldGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new GoldReward();
    }
}
