package design.pattern;

public class Main {

    public static void main(String[] args) {
	    Channel channel = new Channel("YOUTUBE");
	    Follower follower = new Follower();

	    channel.registerObserver(follower);

	    channel.setStatus("New video is Added!");

	    channel.notifyObservers();

		System.out.println("The follower is updated with: " +  follower.channelStatus);

	    channel.removeObserver(follower);
    }
}
