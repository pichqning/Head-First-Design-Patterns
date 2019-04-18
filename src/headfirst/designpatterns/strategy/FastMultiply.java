package headfirst.designpatterns.strategy;

public class FastMultiply implements MultiplyInNumberBehavior {
    @Override
    public void multiply() {
        System.out.println("multi....");
        System.out.println("finish.");
    }
}
