package command.demo.client;


import command.demo.command.Command;
import command.demo.command.NoCommand;

import java.util.LinkedList;
/**遥控器对象*/
public class RemoteControl {

    private LinkedList<Command> prevCommands;

    private Command upCommand;
    private Command downCommand;
    private Command onCommand;
    private Command offCommand;

    public RemoteControl(){
        //init
        prevCommands = new LinkedList<>();
        upCommand = new NoCommand();
        downCommand = new NoCommand();
        onCommand = new NoCommand();
        offCommand = new NoCommand();
    }

    public void setUpCommand(Command upCommand) {
        this.upCommand = upCommand;
    }

    public void setDownCommand(Command downCommand) {
        this.downCommand = downCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    private void setUndoCommand(Command undoCommand) {
        prevCommands.add(undoCommand);
    }

    public void undo(){
        if (!prevCommands.isEmpty()){
            prevCommands.pollLast().undo();
        }else{
            System.out.println("undo列表为空");
        }
    }

    public void tempUp(){
        upCommand.execute();
        setUndoCommand(upCommand);
    }

    public void tempDown(){
        downCommand.execute();
        setUndoCommand(downCommand);
    }

    public void acOn(){
        onCommand.execute();
        setUndoCommand(onCommand);
    }

    public void acOff(){
        offCommand.execute();
        setUndoCommand(offCommand);
    }
}
