package enumeration;
enum TrafficSignal{
    RED(30),
    YELLOW(5),
    GREEN(45);

    private int duration;

    TrafficSignal(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
}
public class EnumFieldsExample {
    public static void main(String[] args){
        TrafficSignal signal = TrafficSignal.RED;

        System.out.println("Signal: " + signal);
        System.out.println("Duration: " + signal.getDuration() + " seconds");

        System.out.println("\nAll Signals:");
        for(TrafficSignal s : TrafficSignal.values()){
            System.out.println(s + "->" + s.getDuration() + " seconds");
        }
    }

}
