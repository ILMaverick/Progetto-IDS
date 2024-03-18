public class Curator extends AbstractUser {

	public Curator(String userName, String password) {
		super(userName, password);
	}

	public void checkContent() {
		throw new UnsupportedOperationException();
	}

	public void modifyContent() {
		throw new UnsupportedOperationException();
	}

	public void search() {
		throw new UnsupportedOperationException();
	}

	public void access() {
		throw new UnsupportedOperationException();
	}

	public void show() {
		throw new UnsupportedOperationException();
	}
}