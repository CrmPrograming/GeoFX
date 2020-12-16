package dad.javafx.geofx.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Geodatos {

	private StringProperty ip = new SimpleStringProperty();
	private ObjectProperty<Location> location = new SimpleObjectProperty<>(new Location());
	private ObjectProperty<Security> security = new SimpleObjectProperty<>(new Security());

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

	public final ObjectProperty<Security> securityProperty() {
		return this.security;
	}

	public final Security getSecurity() {
		return this.securityProperty().get();
	}

	public final void setSecurity(final Security security) {
		this.securityProperty().set(security);
	}

}
