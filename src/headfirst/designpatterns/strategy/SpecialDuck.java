package headfirst.designpatterns.strategy;

public class SpecialDuck extends Duck {

    public SpecialDuck() {
        setFlyBehavior(new FlyUpAndDown());
        setQuackBehavior(new QuackVeryLoud());
        setMultipleBehavior(new FastMultiply());
    }
    public void display() {
        System.out.println("I'm a very special duck.");
    }
}
