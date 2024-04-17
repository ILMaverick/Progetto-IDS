public abstract class Content<T> {
	
	protected T myContent;
	
	protected boolean publishedStatus = false;
	
	public Content(T myContent) {
		this.myContent = myContent;
	}

	abstract void modify(T content);

	abstract void create(T content);

	abstract void show();
}