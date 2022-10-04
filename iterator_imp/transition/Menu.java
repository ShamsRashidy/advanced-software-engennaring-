package headfirst.designpatterns.iterator.transition;

import java.util.Iterator;
/**
 *
 * @author Shams Rashidy
 */
public interface Menu {
	public Iterator<?> createIterator();
}
