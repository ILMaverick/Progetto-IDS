import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tour {
	private static int count=0;
	private final int id;
	private List<PointOfInterest> listOfPOI = new ArrayList<>();

	public Tour(){
		this.id=count++;
	}

	public void addPOI(PointOfInterest pointOfInterest) {
		if(listOfPOI.contains(pointOfInterest)){
			throw new IllegalArgumentException();
		} else {
			listOfPOI.add(pointOfInterest);
		}
	}

	public void removePOI(PointOfInterest pointOfInterest){
		if(listOfPOI.contains(pointOfInterest)){
			listOfPOI.remove(pointOfInterest);
		} else throw new IllegalArgumentException();
	}

	public List<PointOfInterest> getPOIs(){
		return listOfPOI;
	}

	public int getId(){
		return id;
	}
}