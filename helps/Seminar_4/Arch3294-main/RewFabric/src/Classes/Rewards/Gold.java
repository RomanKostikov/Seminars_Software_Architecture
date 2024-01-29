package Classes.Rewards;

import Classes.iGameItem;

public class Gold implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gold!");
    }
    
}
