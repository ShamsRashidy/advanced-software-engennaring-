package headfirst.designpatterns.iterator.implicit;

import java.util.Iterator;
/**
 *
 * @author Shams Rashidy
 */
public interface Menu {
	public Iterator<MenuItem> createIterator();
}
