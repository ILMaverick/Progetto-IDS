public class Contributor extends AbstractUser {

	public Contributor(String name, String surname) {
		super(name,surname);
	}

	public void createPOI() {
		throw new UnsupportedOperationException();
	}

	public void createTour() {
		throw new UnsupportedOperationException();
	}

	public void loadContent() {
		throw new UnsupportedOperationException();
	}

	public void modifyContent() {
		throw new UnsupportedOperationException();
	}
	
	public void modifyPOI() {
		throw new UnsupportedOperationException();
	}
}