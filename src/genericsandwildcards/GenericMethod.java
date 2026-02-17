package genericsandwildcards;
class GetFirst{
    public static <T> T index(T[] array){
        return array[0];
    }
}
public class GenericMethod {
    public static void main(String[] args){
        Integer[] nums = {10,20,30};
        String[] str = {"Java","C","Python"};

        System.out.println(GetFirst.index(nums));
        System.out.println(GetFirst.index(str));
    }
}
