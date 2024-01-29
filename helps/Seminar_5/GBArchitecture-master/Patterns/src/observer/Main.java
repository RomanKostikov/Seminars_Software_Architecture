package observer;

import observer.Users.OfficialUser;
import observer.Users.RecruiterUser;
import observer.Users.RegularUser;
import observer.classes.Page;

public class Main {
    public static void main(String[] args) {
        Page page = new Page();
        page.addNewPost("1-rst post");

        RegularUser user = new RegularUser(page);
        page.addNewPost("Have a n1s day");

        System.out.println();

        RecruiterUser recruiterUser = new RecruiterUser(page);
        OfficialUser officialUser = new OfficialUser(page);

        page.addNewPost("Latest post for all");
    }

}
