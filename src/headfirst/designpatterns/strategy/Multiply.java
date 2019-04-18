package headfirst.designpatterns.strategy;

public class Multiply implements MultiplyInNumberBehavior {
    @Override
    public void multiply() {
        System.out.println("multiplying...");
        System.out.println("finish");
    }
}
