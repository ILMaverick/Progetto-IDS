package contents;

import elements.PointOfInterest;

public abstract class Content {

	private boolean status;
	private PointOfInterest pointOfInterest;

	public void mofify() {
		// TODO
	}

	public void create() {
		// TODO
	}

	public void show() {
		// TODO
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public PointOfInterest getPointOfInterest() {
		return pointOfInterest;
	}

	public void setPointOfInterest(PointOfInterest pointOfInterest) {
		this.pointOfInterest = pointOfInterest;
	}

}
