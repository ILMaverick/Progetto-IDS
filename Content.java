public abstract class Content<T> {
	private boolean publishedStatus;

	abstract void modify(T content);

	abstract void create(T content);

	abstract void show();
}