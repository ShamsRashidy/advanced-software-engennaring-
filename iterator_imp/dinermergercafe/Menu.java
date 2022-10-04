package headfirst.designpatterns.iterator.dinermergercafe;
/**
 *
 * @author Shams Rashidy
 */
import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
