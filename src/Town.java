import java.util.ArrayList;
import java.util.List;

public class Town {
	private String name;
	private PointOfInterest myPosition;
	public List<Tour> tours = new ArrayList<>();
	public List<PointOfInterest> pointsOfInterest = new ArrayList<>();

	public Town (String name, PointOfInterest myPosition){
		this.name = name;
		this.myPosition = myPosition;
	}

	public void addPOI(PointOfInterest pointOfInterest){
		if(pointsOfInterest.contains(pointOfInterest)){
			throw new IllegalArgumentException();
		} else pointsOfInterest.add(pointOfInterest);
	}

	public void addTour(Tour tour){
		if(tours.contains(tour)){
			throw new IllegalArgumentException();
		} else tours.add(tour);
	}

	public void removePOI(PointOfInterest pointOfInterest){
		if(pointsOfInterest.contains(pointOfInterest)){
			pointsOfInterest.remove(pointOfInterest);
		} else throw new IllegalArgumentException();
	}

	public void removeTour(Tour tour){
		if(tours.contains(tour)){
			tours.remove(tour);
		} else throw new IllegalArgumentException();
	}

	public String getName() {
		return name;
	}

	public PointOfInterest getMyPosition() {
		return myPosition;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public List<PointOfInterest> getPointsOfInterest() {
		return pointsOfInterest;
	}
}