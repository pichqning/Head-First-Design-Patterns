package headfirst.designpatterns.strategy;

public class QuackVeryLoud implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK!!");    }
}
