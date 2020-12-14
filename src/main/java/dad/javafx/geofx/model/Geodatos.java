package dad.javafx.geofx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Geodatos {

	private ObjectProperty<Location> location = new SimpleObjectProperty<>();

	public final ObjectProperty<Location> locationProperty() {
		return this.location;
	}
	

	public final Location getLocation() {
		return this.locationProperty().get();
	}
	

	public final void setLocation(final Location location) {
		this.locationProperty().set(location);
	}
	
}
