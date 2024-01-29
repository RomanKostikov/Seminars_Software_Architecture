package factoryMethod.generators;

import factoryMethod.interfaces.iRewardItem;

public abstract class ItemFabric {
    public void openReward() {
        iRewardItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iRewardItem createItem();

}
