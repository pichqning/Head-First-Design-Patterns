package headfirst.designpatterns.strategy;

public class SlowMultiply implements MultiplyInNumberBehavior {
    @Override
    public void multiply() {
        System.out.println("multiplying..........................");
        System.out.println(".....................................");
        System.out.println("finish");
    }
}
