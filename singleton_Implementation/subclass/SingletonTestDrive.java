package headfirst.designpatterns.singleton.subclass;
/**
 *
 * @author Shams Rashidy
 */
public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
