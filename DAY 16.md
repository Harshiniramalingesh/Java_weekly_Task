1. What is Multithreading?
Multithreading is the execution of multiple threads within a single program.
It allows a program to perform multiple tasks at the same time.
Threads share the same memory space.

2. What is a Thread?
A thread is the smallest unit of execution inside a process.

Each thread has:
Its own stack memory
Shared heap memory
Threads are lightweight compared to processes.

3. Why Do We Use Multithreading?
To improve performance
To improve application responsiveness
To utilize CPU efficiently
To handle multiple users/tasks simultaneously

4. Ways to Create Thread in Java
Extending Thread class
Override run() method
Call start() method
Implementing Runnable interface (Recommended)
Implement run()
Pass object to Thread constructor

5. Thread Life Cycle (Basic States)
NEW – Thread object created
RUNNABLE – Ready to execute
WAITING / TIMED_WAITING – Waiting for some time or event
BLOCKED – Waiting for lock
TERMINATED – Execution completed

6. Important Thread Methods
start() – Starts thread execution
run() – Contains code to execute
sleep() – Pauses thread for specific time
join() – Waits for another thread to finish
interrupt() – Sends signal to stop

7. What is Race Condition?
Occurs when multiple threads access shared data at the same time.
Leads to incorrect or inconsistent results.
Happens when operations are not synchronized.
Example:
count++ is not atomic.

8. What is Synchronization?
Synchronization controls access to shared resources.
Ensures only one thread accesses critical section at a time.
Achieved using synchronized keyword.

9. What is Thread Safety?
A class is thread-safe if it works correctly in multithreaded environment.
Achieved using synchronization or atomic classes.

10. Concurrency vs Parallelism
Concurrency:
Multiple tasks progressing together.
May run on single CPU using time slicing.

Parallelism:
Multiple tasks running truly at the same time.
Requires multiple CPU cores.

11. Daemon Thread
Background thread.
JVM does not wait for daemon threads to finish.
Example: Garbage Collector.

12. Advantages of Multithreading
Faster execution
Better resource utilization
Improved user experience

13. Disadvantages of Multithreading
Hard to debug
Can cause deadlock
Can cause race conditions
Increases complexity
