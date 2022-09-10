package headfirst.designpatterns.strategy;
/**
 *
 * @author ShamsRashidy
 */
public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
