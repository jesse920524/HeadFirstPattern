package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(new LightOnCommand(new Light()));
        simpleRemoteControl.onClick();
    }
}
