package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		multipleBehavior = new SlowMultiply();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
