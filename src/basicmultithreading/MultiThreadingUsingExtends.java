package basicmultithreading;

class Test1 extends Thread{

    public void run(){
        for(int i = 'a'; i<='d'; i++){
            System.out.println((char)i);

            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Test2 extends Thread{

    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println(i);

            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadingUsingExtends {
    public static void main(String[] args){
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        t1.start();
        t2.start();
    }
}
