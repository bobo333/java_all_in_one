public class SingletonApp {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        if (s1 == s2) {
            System.out.println("They are the same instance!");
        } else {
            System.out.println("They are different instances.");
        }
    }
}



class SingletonClass {
    private static SingletonClass instance;

    // make constructor private so can not be used externally
    private SingletonClass() {}

    // public method to get instance of singleton
    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}