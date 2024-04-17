public class Administrator extends AbstractUser {

	public Administrator(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	public Rule releasePermission() {
		throw new UnsupportedOperationException();
	}
}