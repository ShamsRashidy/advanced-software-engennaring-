package headfirst.designpatterns.strategy;
/**
 *
 * @author ShamsRashidy
 */
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
