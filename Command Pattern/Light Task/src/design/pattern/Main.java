package design.pattern;

public class Main {

    public static void main(String[] args) {
	    SimpleRemoteControl remote = new SimpleRemoteControl();
	    Light light = new Light();

	    LightOnCommand lightOn = new LightOnCommand(light);
	    remote.setCommand(lightOn);
	    remote.buttonWasPressed();
	    remote.unpressedButton();

	    LightOffCommand lightOff = new LightOffCommand(light);
	    remote.setCommand(lightOff);
	    remote.buttonWasPressed();
	    remote.unpressedButton();
    }
}
