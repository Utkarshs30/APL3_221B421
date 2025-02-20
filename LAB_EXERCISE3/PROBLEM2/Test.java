// Test.java
public class Test implements Testable {
    // Providing implementation for the display method
    @Override
    public void display() {
        System.out.println("Display method implemented in Test class.");
    }

    // Main method for testing
    public static void main(String[] args) {
        Test test = new Test();
        test.display();  // Calling the display method
    }
}
