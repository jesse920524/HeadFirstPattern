package command.demo.command;

import command.demo.command.Command;
import command.demo.receiver.AirConditioner;

public class OnCommand implements Command {

    private AirConditioner ac;

    public OnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }
}
