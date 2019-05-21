import qdl.list.IList;

public class List<T> implements IList<T> {

	public Link start;
	public Link end;

	@Override
	public int size() {
		int count = 0;
		Link i = start;
		while (i != null) {
			
			i = i.next;
			count++;

		}

		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFront(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAll(IList<T> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(int index, T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IList<T> split(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

}
