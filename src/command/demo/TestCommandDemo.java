package command.demo;

import command.RemoteControlTest;
import command.demo.client.RemoteControl;
import command.demo.command.*;
import command.demo.receiver.AirConditioner;

public class TestCommandDemo {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Command onCommand = new OnCommand(airConditioner);
        Command offCommand = new OffCommand(airConditioner);
        Command tempUpCommand = new TempUpCommand(airConditioner);
        Command tempDownCommand = new TempDownCommand(airConditioner);

        RemoteControl control = new RemoteControl();
        control.setOnCommand(onCommand);
        control.setOffCommand(offCommand);
        control.setUpCommand(tempUpCommand);
        control.setDownCommand(tempDownCommand);

        /**开始操作*/
        control.acOn();
        control.tempUp();
        control.tempUp();
        control.tempUp();
        control.tempDown();
        control.undo();
        control.undo();
        control.acOff();
    }
}
