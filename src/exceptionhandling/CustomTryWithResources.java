package exceptionhandling;

class Resource implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically");
    }
}

public class CustomTryWithResources {
    public static void main(String[] args) {

        try (Resource r = new Resource()) {
            r.use();
        }
    }
}


