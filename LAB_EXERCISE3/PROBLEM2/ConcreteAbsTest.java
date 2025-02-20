// ConcreteAbsTest.java
public class ConcreteAbsTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteAbsTest class.");
    }

    // Main method for testing
    public static void main(String[] args) {
        ConcreteAbsTest test = new ConcreteAbsTest();
        test.display();  // Calling the display method
    }
}
