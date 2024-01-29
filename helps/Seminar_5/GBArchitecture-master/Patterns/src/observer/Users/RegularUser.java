package observer.Users;

import observer.classes.Page;
import observer.interfaces.iFollower;

public class RegularUser implements iFollower {
    Page page;

    public RegularUser(Page page) {
        this.page = page;
        page.registerFollower(this);
    }

    @Override
    public void update() {
        System.out.println("Latest post seen by a Normal user: " + page.getLatestPost());
    }
}
