import qdl.list.AbstractListTest;
import qdl.list.IList;

public class ListTest extends AbstractListTest {

	@Override
	public <T> IList<T> get() {
		// TODO Auto-generated method stub
		return new List<T>();
	}

}
