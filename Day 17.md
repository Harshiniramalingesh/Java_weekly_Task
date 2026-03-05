Thread Pool
A Thread Pool is a collection of reusable threads used to execute multiple tasks.

Purpose:
Avoid creating new threads repeatedly
Improve performance
Control number of concurrent threads
Reduce memory overhead
Instead of creating threads manually:
new Thread(task).start();
We use a thread pool that reuses existing threads.

ExecutorService
ExecutorService is an interface in java.util.concurrent used to manage thread pools and execute tasks.
It separates:
Task submission
Thread management

Creation example:
ExecutorService service = Executors.newFixedThreadPool(5);

Responsibilities:
Manage worker threads
Accept tasks
Shutdown properly

Important Methods:
submit()
Submits a task and returns a Future.
execute()
Executes a Runnable task (no return value).
shutdown()
Stops accepting new tasks but completes existing ones.
shutdownNow()
Attempts to stop all running tasks immediately.
awaitTermination()
Waits until all tasks finish after shutdown.

Types of Thread Pools:
newFixedThreadPool(n)
Fixed number of threads.
newCachedThreadPool()
Creates threads as needed, reuses idle threads.
newSingleThreadExecutor()
Only one worker thread.

Callable
Callable is similar to Runnable but:
Returns a value
Can throw checked exceptions

Runnable:
Does not return value
Cannot throw checked exceptions

Callable Example:
Callable<Integer> task = () -> {
return 100;
};

Used when:
You need result from a thread
You need exception handling in task

Future
Future represents the result of an asynchronous computation.
When submitting a Callable:
Future<Integer> result = service.submit(task);


Future allows you to:
Get result later
Check if task completed
Cancel task

Important Methods:
get()
Returns result. Blocks until result is ready.
isDone()
Checks whether task is completed.
cancel()
Attempts to cancel execution.

Future enables asynchronous programming:
Submit multiple tasks
Continue other work
Collect results later
Shutdown Hook
A Shutdown Hook is a thread that runs when the JVM is shutting down.

Added using:
Runtime.getRuntime().addShutdownHook(
    new Thread(() -> {
        System.out.println("Cleanup code executed");
    })
);


It runs when:
Program exits normally
System shutdown
Ctrl + C is pressed

Use cases:
Closing database connections
Releasing resources
Saving data
Logging final operations

