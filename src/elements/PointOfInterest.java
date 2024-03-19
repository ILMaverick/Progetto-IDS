package elements;

import contents.ContentAlbum;

public class PointOfInterest {

	private String name;
	private final int ID;
	private final Coordinates coordinates;
	private ContentAlbum album;

	public PointOfInterest(String name, int ID, Coordinates coordinates, ContentAlbum album) {
		this.name = name;
		this.ID = ID;
		this.coordinates = coordinates;
		this.album = album;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public ContentAlbum getContentAlbum() {
		return album;
	}
}
