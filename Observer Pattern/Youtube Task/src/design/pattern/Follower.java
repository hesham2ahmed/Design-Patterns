package design.pattern;

public class Follower implements IObserver {
    private String followerName;
    public String channelStatus;

    @Override
    public void update(String s) {
        this.channelStatus = s;
        System.out.println("The status is updated with: " + this.channelStatus);
    }

    public void play(){}
}
