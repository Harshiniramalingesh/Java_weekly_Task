package enumeration;

enum OrderState {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED
}

class Order {
    private OrderState state;

    public Order() {
        state = OrderState.NEW; // initial state
    }

    public void nextState() {
        if (state == OrderState.NEW) {
            state = OrderState.PROCESSING;
        } else if (state == OrderState.PROCESSING) {
            state = OrderState.SHIPPED;
        } else if (state == OrderState.SHIPPED) {
            state = OrderState.DELIVERED;
        } else {
            System.out.println("Order already delivered. Cannot change state.");
            return;
        }
        System.out.println("Order moved to: " + state);
    }

    public OrderState getState() {
        return state;
    }
}



public class OrdersDemo {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Initial State: " + order.getState());

        order.nextState();
        order.nextState();
        order.nextState();
        order.nextState();
    }
}

