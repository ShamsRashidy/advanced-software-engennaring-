package headfirst.designpatterns.iterator.implicit;
/**
 *
 * @author Shams Rashidy
 */
public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		// Use implicit iteration
		waitress.printMenu();
	}
}
