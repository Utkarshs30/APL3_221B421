public class Main {
    public static void main(String[] args) {
        

        Testable testObj = new Test(); 
        testObj.display(); 
        

        AbsTest absTestObj = new AbsTest() {
            @Override
            public void display() {
                System.out.println("This is the display method from the anonymous subclass of AbsTest.");
            }
        };
        absTestObj.display(); 
    }
}
