package command;
/**
 * 遥控器类.*/
public class SimpleRemoteControl {
    private Command slot;//持有一个命令对象.

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        this.slot = command;//为遥控器设置命令对象.
    }

    public void onClick(){
        slot.execute();//触发按键时, 调用命令对象#execute()
    }
}
