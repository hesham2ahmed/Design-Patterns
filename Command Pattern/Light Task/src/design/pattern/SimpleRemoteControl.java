package design.pattern;

public class SimpleRemoteControl {
    Command slot;
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
    public void unpressedButton(){
        slot.undo();
    }
}
