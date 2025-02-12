package headfirst.designpatterns.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	MultiplyInNumberBehavior multipleBehavior;

	public Duck() {

	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	public void setMultipleBehavior(MultiplyInNumberBehavior mb) { multipleBehavior = mb;}

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performMultiply() { multipleBehavior.multiply();}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
