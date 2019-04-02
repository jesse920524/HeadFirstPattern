package command.demo.command;

import command.demo.command.Command;
import command.demo.receiver.AirConditioner;

public class TempUpCommand implements Command {

    private AirConditioner airConditioner;

    public TempUpCommand(AirConditioner ac){
        this.airConditioner = ac;
    }

    @Override
    public void execute() {
        airConditioner.tempUp();
    }

    @Override
    public void undo() {
        airConditioner.tempDown();
    }
}
