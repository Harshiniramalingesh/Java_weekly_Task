package abstractinterfaces;
interface Vehicle {
     void switchOn();
    interface Engine {
        void start();
    }
}

class Car implements Vehicle.Engine,Vehicle {

    @Override
    public void start() {

        System.out.println("Car engine started");
    }
    public void switchOn(){
        System.out.println("Vehicle starting");
    }
}
public class NestedInterfaceInsideInterfaceDemo {
    public static void main(String[] args) {

        Vehicle.Engine engine = new Car();
        engine.start();
        Vehicle vehicle = new Car();
        vehicle.switchOn();
    }
}
