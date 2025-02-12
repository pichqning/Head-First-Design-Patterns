package headfirst.designpatterns.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		multipleBehavior = new Multiply();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
