package ObjectPool;

public interface Pool<T> {

	public T acquire();
	public void release(T t);
}
