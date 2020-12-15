package dad.javafx.geofx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Geodatos {

	private StringProperty ip = new SimpleStringProperty();
	private ObjectProperty<Location> location = new SimpleObjectProperty<>(new Location());

	public final StringProperty ipProperty() {
		return this.ip;
	}

	public final String getIp() {
		return this.ipProperty().get();
	}

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}

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
