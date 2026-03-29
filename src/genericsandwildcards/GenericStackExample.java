package genericsandwildcards;
class MyStack<T> {
    private T[] arr;
    private int top;
    public MyStack(int size) {
        arr = (T[]) new Object[size];
        top = -1;
    }

    public void push(T value) {
        if (top == arr.length - 1) {
            T[] newArr = (T[]) new Object[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        top++;
        arr[top] = value;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        T value = arr[top];
        top--;
        return value;
    }
    public T peek() {
        return arr[top];
    }
}
public class GenericStackExample {
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<>(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
