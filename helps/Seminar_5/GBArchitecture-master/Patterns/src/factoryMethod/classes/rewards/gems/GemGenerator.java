package factoryMethod.classes.rewards.gems;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class GemGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new GemReward();
    }
}
