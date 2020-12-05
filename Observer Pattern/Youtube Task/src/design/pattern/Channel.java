package design.pattern;

import java.util.HashSet;
import java.util.Set;

public class Channel implements IObservable{
    private HashSet<IObserver> observers;
    protected String channelName;
    private String status;
    public Channel(String channelName){
        this.observers = new HashSet<>();
        this.channelName = channelName;
    }
    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
        System.out.println("Added follower to: " + this.channelName);
    }
    @Override
    public void removeObserver(IObserver follower) {
        this.observers.remove(follower);
        System.out.println("removed follower from: " + this.channelName);
    }
    @Override
    public void notifyObservers() {
        this.observers.forEach((follower) -> {
            follower.update(this.status);
        });
        System.out.println("Followers are notified by changes!");
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}
