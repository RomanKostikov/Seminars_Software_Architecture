package factoryMethod.classes.rewards.gems;

import factoryMethod.interfaces.iRewardItem;

public class GemReward implements iRewardItem {
    @Override
    public void open() {
        System.out.println("Gems reward");
    }
}
