package enumeration;
enum Operation {

    ADD {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },

    SUBTRACT {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    };

    abstract double apply(double x, double y);
}

public class EnumAbstractOperations {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        Operation op = Operation.ADD;
        double result = op.apply(a, b);
        System.out.println("Operation: " + op);
        System.out.println("Result: " + result);

        System.out.println("\nAll Operations:");
        for (Operation o : Operation.values()) {
            System.out.println(o + " → " + o.apply(a, b));
        }
    }
}
