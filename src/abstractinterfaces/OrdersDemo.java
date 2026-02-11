package abstractinterfaces;
abstract class Order{
    static int orderCount = 0;
 Order(){
     orderCount++;
     System.out.println("Order initialized");
 }

    static void showTotalOrders() {
        System.out.println("Total orders created: " + orderCount);
    }

 abstract void processOrder();

    void generateInvoice() {
        System.out.println("Invoice generated");
    }
}

class AmazonOrder extends Order{
    AmazonOrder(){
        System.out.println("Amazon order created");
    }

    @Override
    void processOrder(){
        System.out.println("Processing Amazon order");
    }
}
public class OrdersDemo {
    public static void main(String[] args){
        Order.showTotalOrders();

        Order o1 = new AmazonOrder();
        o1.processOrder();
        o1.generateInvoice();

        System.out.println();

        Order o2 = new AmazonOrder();
        o2.processOrder();

        Order.showTotalOrders();
    }
}
