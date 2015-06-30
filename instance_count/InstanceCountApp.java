public class InstanceCountApp {
    public static void main(String[] args) {
        printCount();

        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    public static void printCount() {
        System.out.println("There are now " + CountTest.getInstanceCount() + " instances of the CountTest class.");
    }
}

class CountTest {
    private static int instanceCount = 0;

    // the constructor
    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}