package abstractinterfaces;


interface Plugin {
    void execute();
}


class CoreSystem {

    private Plugin[] plugins;

    public CoreSystem(Plugin[] plugins) {
        this.plugins = plugins;
    }

    public void runPlugins() {
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}

public class PluginSystemDemo {

    public static void main(String[] args) {


        Plugin p1 = new Plugin() {

            public void execute() {
                System.out.println("Authentication plugin executed");
            }
        };

        Plugin p2 = new Plugin() {
            public void execute() {
                System.out.println("Logging plugin executed");
            }
        };

        Plugin p3 = new Plugin() {
            public void execute() {
                System.out.println("Payment plugin executed");
            }
        };

        Plugin[] plugins = { p1, p2, p3 };

        CoreSystem core = new CoreSystem(plugins);
        core.runPlugins();
    }
}

