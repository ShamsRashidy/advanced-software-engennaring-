package headfirst.designpatterns.singleton.stat;
/**
 *
 * @author Shams Rashidy
 */
public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
