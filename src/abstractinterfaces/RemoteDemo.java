package abstractinterfaces;
abstract class Remote{
    abstract void power();
}
class Tv extends Remote{
    boolean isOn = false;
     void power() {
         if (isOn) {
             System.out.println("TV is ON");
             isOn = false;

         } else {
             System.out.println("TV is OFF");
             isOn = true;
         }
     }


}
public class RemoteDemo {
    public static void main(String[] args) {
      Remote remote = new Tv();
      remote.power();
      remote.power();

    }
}
