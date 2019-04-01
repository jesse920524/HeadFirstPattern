package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();


        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getInstance();
                System.out.println("singleton2: " + singleton2);
            }
        }).start();


        System.out.println("singleton1: " + singleton1);
    }
}
