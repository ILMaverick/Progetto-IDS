import java.util.ArrayList;
import java.util.List;

public class Tour {
	private static int count=0;
	private final int id;
	private List<PointOfInterest> listOfPOI = new ArrayList<>();
	private List<Content> description = new ArrayList<>();
	public Town myTown;

	public Tour(Town town){
		this.id=count++;
		this.myTown=town;
	}

	public void addPOI(PointOfInterest pointOfInterest) {
		if(listOfPOI.contains(pointOfInterest)){
			throw new IllegalArgumentException();
		} else {
			listOfPOI.add(pointOfInterest);
		}
	}

	public void addDescription(Content content){
		if(description.contains(content)){
			throw new IllegalArgumentException();
		} else description.add(content);
	}

	public void removePOI(PointOfInterest pointOfInterest){
		if(listOfPOI.contains(pointOfInterest)){
			listOfPOI.remove(pointOfInterest);
		} else throw new IllegalArgumentException();
	}

	public void removeDescription(Content content){
		if(description.contains(content)){
			description.remove(content);
		} else throw new IllegalArgumentException();
	}

	public Town getTown(){
		return myTown;
	}

	public List<Content> getDescriptions(){
		return description;
	}

	public List<PointOfInterest> getPOIs(){
		return listOfPOI;
	}

	public int getId(){
		return id;
	}
}