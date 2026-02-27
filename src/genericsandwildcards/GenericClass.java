package genericsandwildcards;

//    import com.sun.jdi.IntegerValue;

class Box<T>{
    private T data;

    void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
public class GenericClass {
    public static void main(String[] args){
        Box<Integer> box1 = new Box<>();
        box1.setData(100);

        Box<String> box2 = new Box<>();
        box2.setData("Java");

        System.out.println(box1.getData());
        System.out.println(box2.getData());
    }
}
