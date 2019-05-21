import qdl.list.IList;

public class List<T> implements IList<T> {

	public Link<T> start;
	public Link<T> end;

	@Override
	public int size() {
		int count = 0;
		Link<T> i = start;
		while (i != null) {

			i = i.next;
			count++;

		}

		return count;
	}

	@Override
	public boolean isEmpty() {
		Link<T> i = start;
		if(i== null) {
			return true;
		}
		return false;
	}

	@Override
	public void add(T data) {
		if(start == null) {
			start = end= new Link<T>();
			start.data = data;
		}else {
			end.next = new Link<T>();
			end.next.data = data;
			end = end.next;
		}

	}

	@Override
	public void addFront(T data) {
		

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
