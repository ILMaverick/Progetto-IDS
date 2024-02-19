package Users;

public abstract class AbstractUser implements User {

	private int userID;
	private String name;
	private String surname;

	public void search() {
		// TODO Auto-generated method stub

	}

	public void access() {
		// TODO Auto-generated method stub

	}

	public void show() {
		// TODO Auto-generated method stub

	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
