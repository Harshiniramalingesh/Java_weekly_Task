package basicmultithreading;

public class BankTransaction extends Thread{
   private String transactionName;

   BankTransaction(String name){
       this.transactionName = name;
   }

   public void run(){
       System.out.println(transactionName + " " + "started");

       try{
           Thread.sleep(2000);
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }

       System.out.println(transactionName + " " + "Completed");
   }

   public static void main(String[] args){
       BankTransaction b1 = new BankTransaction("Deposit");
       BankTransaction b2 = new BankTransaction("Wtihdrawl");

       b1.start();
       b2.start();

   }
}
