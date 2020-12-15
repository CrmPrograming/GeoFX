package dad.javafx.geofx.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class Location {

	private DoubleProperty latitude = new SimpleDoubleProperty();
	private DoubleProperty longitude = new SimpleDoubleProperty();
	private StringProperty ipLocation = new SimpleStringProperty();
	private ObjectProperty<Image> flagIcon = new SimpleObjectProperty<>();
	private StringProperty cityState = new SimpleStringProperty();
	private IntegerProperty zipCode = new SimpleIntegerProperty();
	private StringProperty language = new SimpleStringProperty();
	private StringProperty timeZone = new SimpleStringProperty();
	private StringProperty callingCode = new SimpleStringProperty();
	private StringProperty currency = new SimpleStringProperty();
	public final DoubleProperty latitudeProperty() {
		return this.latitude;
	}
	
	public final double getLatitude() {
		return this.latitudeProperty().get();
	}
	
	public final void setLatitude(final double latitude) {
		this.latitudeProperty().set(latitude);
	}
	
	public final DoubleProperty longitudeProperty() {
		return this.longitude;
	}
	
	public final double getLongitude() {
		return this.longitudeProperty().get();
	}
	
	public final void setLongitude(final double longitude) {
		this.longitudeProperty().set(longitude);
	}
	
	public final StringProperty ipLocationProperty() {
		return this.ipLocation;
	}
	
	public final String getIpLocation() {
		return this.ipLocationProperty().get();
	}
	
	public final void setIpLocation(final String ipLocation) {
		this.ipLocationProperty().set(ipLocation);
	}
	
	public final ObjectProperty<Image> flagIconProperty() {
		return this.flagIcon;
	}
	
	public final Image getFlagIcon() {
		return this.flagIconProperty().get();
	}
	
	public final void setFlagIcon(final Image flagIcon) {
		this.flagIconProperty().set(flagIcon);
	}
	
	public final StringProperty cityStateProperty() {
		return this.cityState;
	}
	
	public final String getCityState() {
		return this.cityStateProperty().get();
	}
	
	public final void setCityState(final String cityState) {
		this.cityStateProperty().set(cityState);
	}
	
	public final IntegerProperty zipCodeProperty() {
		return this.zipCode;
	}
	
	public final int getZipCode() {
		return this.zipCodeProperty().get();
	}
	
	public final void setZipCode(final int zipCode) {
		this.zipCodeProperty().set(zipCode);
	}
	
	public final StringProperty languageProperty() {
		return this.language;
	}
	
	public final String getLanguage() {
		return this.languageProperty().get();
	}
	
	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	
	public final StringProperty timeZoneProperty() {
		return this.timeZone;
	}
	
	public final String getTimeZone() {
		return this.timeZoneProperty().get();
	}
	
	public final void setTimeZone(final String timeZone) {
		this.timeZoneProperty().set(timeZone);
	}
	
	public final StringProperty callingCodeProperty() {
		return this.callingCode;
	}
	
	public final String getCallingCode() {
		return this.callingCodeProperty().get();
	}
	
	public final void setCallingCode(final String callingCode) {
		this.callingCodeProperty().set(callingCode);
	}
	
	public final StringProperty currencyProperty() {
		return this.currency;
	}
	
	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	
	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	
}
