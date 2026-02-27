package objectoriented;

public class ObjectCounter {
    static int count = 0;

    public ObjectCounter() {
        count++;
    }

    public static void main(String[] args) {

        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();

        System.out.println("Objects created: " + ObjectCounter.count);
    }
}
