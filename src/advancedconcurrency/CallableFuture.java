package advancedconcurrency;
import java.util.concurrent.*;
public class CallableFuture {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> 50 + 50;
        Future<Integer> future = service.submit(task);

        Integer result = future.get();
        System.out.println("Result: " + result);

        service.shutdown();
    }
}
