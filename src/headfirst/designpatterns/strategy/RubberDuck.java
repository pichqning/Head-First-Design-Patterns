package headfirst.designpatterns.strategy;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
		multipleBehavior = new FastMultiply();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
