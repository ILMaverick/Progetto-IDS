public class Curator extends AbstractUser {

	public Curator(String name, String surname) {
		super(name, surname);
	}

	public void checkContent() {
		throw new UnsupportedOperationException();
	}

	public void modifyContent() {
		throw new UnsupportedOperationException();
	}
}