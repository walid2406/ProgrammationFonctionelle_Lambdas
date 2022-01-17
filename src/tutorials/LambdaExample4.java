package tutorials;

public class LambdaExample4 {

    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("execute a run method");

            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

    Thread thread1=new Thread(()-> System.out.println("lambda run exucutation thread"));
    thread1.start();

    }

}
