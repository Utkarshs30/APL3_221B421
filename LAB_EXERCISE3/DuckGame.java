
public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack();
    }
}
