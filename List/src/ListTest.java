import qdl.list.AbstractListTest;
import qdl.list.IList;

public class ListTest<T extends AbstractListTest> {

	public IList<T> get() {
		// TODO Auto-generated method stub
		return new List<T>();
	}

}
