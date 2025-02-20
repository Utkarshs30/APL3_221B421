public class LakeDuck implements Duck, Flyable, Quackable {

    public void swim() {
        System.out.println("Lake Duck is swimming!");
    }

    public void fly() {
        System.out.println("Lake Duck is flying!");
    }

    public void quack() {
        System.out.println("Lake Duck quacks!");
    }
}
