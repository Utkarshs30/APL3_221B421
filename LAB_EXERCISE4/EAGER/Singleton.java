public class Singleton {
    // Eager initialization of the Singleton instance
    private static Singleton uniqueInstance = new Singleton();

   
    private Singleton() { }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Different instances created. Singleton pattern failed.");
        }
    }
}