package factoryMethod.classes.rewards;

import factoryMethod.classes.rewards.bronze.BronzeGenerator;
import factoryMethod.classes.rewards.diamond.DiamondGenerator;
import factoryMethod.classes.rewards.gems.GemGenerator;
import factoryMethod.classes.rewards.gold.GoldGenerator;
import factoryMethod.classes.rewards.iron.IronGenerator;
import factoryMethod.classes.rewards.platinum.PlatinumGenerator;
import factoryMethod.classes.rewards.silver.SilverGenerator;
import factoryMethod.generators.ItemFabric;
import factoryMethod.interfaces.iGiver;

import java.util.concurrent.ThreadLocalRandom;

public class RewardGiver implements iGiver {
    @Override // чтоб не плодить лишние, и по-хорошему, нужно написать тут private метод который бы возвращал class.openReward() и тот sout в консольку
    public void giveReward() {
        switch (ThreadLocalRandom.current().nextInt(0, 6 + 1)) {
            case 0 -> {
                ItemFabric ironReward = new IronGenerator();
                ironReward.openReward();
            }
            case 1 -> {
                ItemFabric bronzeReward = new BronzeGenerator();
                bronzeReward.openReward();
            }
            case 2 -> {
                ItemFabric silverReward = new SilverGenerator();
                silverReward.openReward();
            }
            case 3 -> {
                ItemFabric goldReward = new GoldGenerator();
                goldReward.openReward();
            }
            case 4 -> {
                ItemFabric platinumReward = new PlatinumGenerator();
                platinumReward.openReward();
            }
            case 5 -> {
                ItemFabric gemsReward = new GemGenerator();
                gemsReward.openReward();
            }
            case 6 -> {
                ItemFabric diamondReward = new DiamondGenerator();
                diamondReward.openReward();

            }
        }
    }
}
