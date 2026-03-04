package advancedconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;

            service.execute(() -> {
                System.out.println("Task " + taskNumber +
                        " executed by " +
                        Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }
}

