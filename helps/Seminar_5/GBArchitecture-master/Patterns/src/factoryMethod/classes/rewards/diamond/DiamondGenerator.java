package factoryMethod.classes.rewards.diamond;

import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iRewardItem;

public class DiamondGenerator extends ItemFabric {
    @Override
    public iRewardItem createItem() {
        return new DiamondReward();
    }
}
