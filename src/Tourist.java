import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tourist extends AbstractUser {

	private final Set<PointOfInterest> myList;
	
	public Tourist(String userName, String password) {
		super(userName, password);
		this.myList = new HashSet<>();
	}

	public void reportInformation() {
		throw new UnsupportedOperationException();
	}
	
	public void saveInformation() {
		throw new UnsupportedOperationException();
	}
	
	public Set<PointOfInterest> getListContent(){
		return this.myList;
	}

}