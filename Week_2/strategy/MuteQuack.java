package headfirst.designpatterns.strategy;
/**
 *
 * @author ShamsRashidy
 */
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
