package collections.box1;

public class Box<T> {
	private T type;

	public T get() {
		return type;
	}

	public void set(T type) {
		this.type = type;
	}
}
