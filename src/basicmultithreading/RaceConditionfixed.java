package basicmultithreading;

class Counterr {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class RaceConditionfixed {
    public static void main(String[] args) throws InterruptedException {

        Counterr c = new Counterr();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    c.increment();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }

        System.out.println("Final Count: " + c.count);
    }
}
