package observer.Users;

import observer.classes.Page;
import observer.interfaces.iFollower;

public class OfficialUser implements iFollower {
    String designation;
    Page page;

    public OfficialUser(Page page) {
        this.page = page;
        page.registerFollower(this);
    }

    @Override
    public void update() {
        System.out.println("Latest post seen by a Official user: " + page.getLatestPost());
    }
}
