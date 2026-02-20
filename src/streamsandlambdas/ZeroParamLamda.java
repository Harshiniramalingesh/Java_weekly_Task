package streamsandlambdas;
interface ZeroParameter{
    void display();
}
public class ZeroParamLamda {
    public static void main(String[] args){
        ZeroParameter zeroParamLambdas = () -> System.out.println("This is a zero-parameter lambda expression!");
        zeroParamLambdas.display();
    }
}
