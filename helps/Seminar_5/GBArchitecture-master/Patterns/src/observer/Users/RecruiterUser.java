package observer.Users;

import observer.classes.Page;
import observer.interfaces.iFollower;

public class RecruiterUser implements iFollower {
    String company;
    Page page;

    public RecruiterUser(Page page) {
        this.page = page;
        page.registerFollower(this);
    }

    @Override
    public void update() {
        System.out.println("Latest post seen by a Recruiter user: " + page.getLatestPost());

    }
}
