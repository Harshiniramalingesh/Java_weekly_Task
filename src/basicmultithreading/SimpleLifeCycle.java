package basicmultithreading;

class SimpleLifeCycle {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread is running...");
                Thread.sleep(2000);

                System.out.println("Thread finished sleep.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("After creation: " + t1.getState());
        t1.start();
        System.out.println("After start(): " + t1.getState());


        Thread.sleep(500);
        System.out.println("During sleep(): " + t1.getState());

        t1.join();
        System.out.println("Main thread waited using join()");

        System.out.println("After completion: " + t1.getState());
    }
}

