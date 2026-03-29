package advancedconcurrency;
class MyThread extends Thread{
    public void run(){
        System.out.println("Shut down hook task completed");
    }
}
public class ShutdownTest {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main is sleeping.Press ctrl+c");

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
