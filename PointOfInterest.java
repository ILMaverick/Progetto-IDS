import java.util.ArrayList;
import java.util.List;

public class PointOfInterest {
	private static int count=0;
	private final String type;
	private final int id;
	private final Coordinates coordinates;
	private List<Content> contents = new ArrayList<>();

	public PointOfInterest(String type, Coordinates coordinates){
		this.type = type;
		this.coordinates = coordinates;
		this.id = count++;
	}

	public void addContent(Content content) {
		if(contents.contains(content)){
			throw new IllegalArgumentException();
		} else contents.add(content);
	}

	public void removeContent(Content content) {
		if(contents.contains(content)){
			contents.remove(content);
		} else throw new IllegalArgumentException();
	}

	public List<Content> show() {
		return contents;
	}

	public String getType(){
		return type;
	}

	public int getId(){
		return id;
	}

	public Coordinates getCoordinates(){
		return coordinates;
	}
}