package command.demo.command;

import command.demo.command.Command;
import command.demo.receiver.AirConditioner;

public class OffCommand implements Command {

    private AirConditioner ac;

    public OffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }

    @Override
    public void undo() {
        ac.on();
    }
}
