package command.demo.receiver;

public class AirConditioner {

    private boolean isRunning;//空调是否运行中
    private int temprature;
    public AirConditioner(){
        temprature = 20;
        isRunning = false;
    }

    public int getTemprature(){
        return this.temprature;
    }

    public void tempUp(){
        if (!isRunning) return;

        if (temprature < 30){
            temprature+=1;
        }
        System.out.println("温度上升 当前温度: " + getTemprature());
    }

    public void tempDown(){
        if (!isRunning) return;

        if (temprature > 10){
            temprature-=1;
        }
        System.out.println("温度下降 当前温度: " + getTemprature());
    }

    public void on(){
        System.out.println("空调开启");
        isRunning = true;
    }

    public void off(){
        System.out.println("空调关闭");
        isRunning = false;
    }
}
