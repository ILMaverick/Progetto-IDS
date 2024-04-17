public abstract class AbstractUser implements User {
	private static int countID=0;
	private int userID;
	private String userName;
	private String password;

	public AbstractUser(String userName, String password){
		this.userID=countID++;
		this.userName=userName;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}
}