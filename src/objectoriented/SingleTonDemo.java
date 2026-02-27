package objectoriented;

public class SingleTonDemo {
    public static void main(String[] args) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();

        System.out.println(obj1==obj2);
}
    public static class AppConfig {
        private AppConfig(){

        }
        private static AppConfig instance;

        public static AppConfig getInstance(){
            if(instance == null){
                instance = new AppConfig();
            }
            return instance;
        }

    }
}
