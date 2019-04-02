package command.demo.command;

import command.demo.command.Command;
import command.demo.receiver.AirConditioner;

public class TempDownCommand implements Command {

    private AirConditioner ac;

    public TempDownCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.tempDown();
    }

    @Override
    public void undo() {
        ac.tempUp();
    }
}
