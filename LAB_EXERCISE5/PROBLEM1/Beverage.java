abstract class Beverage{
    private void pour(int qty){
        System.out.println("Pour " + qty + "ml of Drink in a Glass");
    }
    protected abstract void addCondiment();
    void stir(){}
    private void serve(){
        System.out.println("Serve through Waiter");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}