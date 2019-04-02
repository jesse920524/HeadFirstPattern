package command.demo.command;

import command.demo.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("什么也不做");
    }

    @Override
    public void undo() {
        System.out.println("什么也不做");
    }
}
