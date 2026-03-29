package basicmultithreading;
class TestInterface1 implements Runnable {
    public void run() {
        for (int i = 'a'; i <= 'k'; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Char Printing Ended...");
    }
}
class TestInterface2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Printing number also Ended....");
    }
}
public class MultiThreadingUsingInterface {
    public static void main(String[] args){
        TestInterface1 ti1 = new TestInterface1();
        TestInterface2 ti2 = new TestInterface2();

        Thread th1 = new Thread(ti1);
        Thread th2 = new Thread(ti2);

        th1.start();
        th2.start();
    }
}


