package observer.classes;

import observer.interfaces.iFollower;

import java.util.ArrayList;

public class Page {
    private ArrayList<iFollower> followers;
    String latestPost;

    public Page() {
        followers = new ArrayList<>();
    }

    public void registerFollower(iFollower f){
        followers.add(f);
    }

    public void notifyFollowers(){
        for (iFollower follower : followers) {
            follower.update();
        }
    }

    public String getLatestPost(){
        return latestPost;
    }

    public void addNewPost(String post){
        this.latestPost = post;
        notifyFollowers();
    }
}
