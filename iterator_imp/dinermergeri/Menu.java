package headfirst.designpatterns.iterator.dinermergeri;

import java.util.Iterator;
/**
 *
 * @author Shams Rashidy
 */
public interface Menu {
	public Iterator<MenuItem> createIterator();
}
