public abstract class AbstractUser implements User {
	private static int countID = 0;
	private int userID;
	private String name;
	private String surname;
	private Rule myRule;

	public AbstractUser(String name, String surname) {
		this.userID = countID++;
		this.name = name;
		this.surname = surname;
		this.myRule = Rule.BASE_USER;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getUserID() {
		return this.userID;
	}

	public String getName() {
		return this.name;
	}

	public Rule getRule() {
		return this.myRule;
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void access() {
		// TODO Auto-generated method stub
		
	}
	
	
}