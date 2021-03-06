package dad.javafx.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.model.Location;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class LocationController implements Initializable {

	// model

	private ObjectProperty<Location> location = new SimpleObjectProperty<>();

	// view

	@FXML
	private GridPane view;
	
	@FXML
    private Label lbLatitude;

    @FXML
    private Label lbLongitude;

    @FXML
    private Label lbFlag;

    @FXML
    private ImageView ivFlag;

    @FXML
    private Label lbCityState;

    @FXML
    private Label lbZipCode;

    @FXML
    private Label lbLanguage;

    @FXML
    private Label lbTimeZone;

    @FXML
    private Label lbCallingCode;

    @FXML
    private Label lbCurrency;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.location.addListener((o, ov, nv) -> onLocationChanged(o, ov, nv));
	}

	private void onLocationChanged(ObservableValue<? extends Location> o, Location ov, Location nv) {
		if (ov != null) {
			Bindings.unbindBidirectional(lbLatitude.textProperty(), ov.latitudeProperty());
			Bindings.unbindBidirectional(lbLongitude.textProperty(), ov.longitudeProperty());
			lbFlag.textProperty().unbind();
			ivFlag.imageProperty().unbind();
			lbCityState.textProperty().unbind();
			Bindings.unbindBidirectional(lbZipCode.textProperty(), ov.zipCodeProperty());
			lbLanguage.textProperty().unbind();
			lbTimeZone.textProperty().unbind();
			lbCallingCode.textProperty().unbind();
			lbCurrency.textProperty().unbind();
		}
		
		if (nv != null) {
			Bindings.bindBidirectional(lbLatitude.textProperty(), nv.latitudeProperty(), new NumberStringConverter("#.######"));
			Bindings.bindBidirectional(lbLongitude.textProperty(), nv.longitudeProperty(), new NumberStringConverter("#.######"));
			lbFlag.textProperty().bind(nv.ipLocationProperty());
			ivFlag.imageProperty().bind(nv.flagIconProperty());
			lbCityState.textProperty().bind(nv.cityStateProperty());
			Bindings.bindBidirectional(lbZipCode.textProperty(), nv.zipCodeProperty(), new NumberStringConverter("####"));
			lbLanguage.textProperty().bind(nv.languageProperty());
			lbTimeZone.textProperty().bind(nv.timeZoneProperty());
			lbCallingCode.textProperty().bind(nv.callingCodeProperty());
			lbCurrency.textProperty().bind(nv.currencyProperty());
		}
	}

	public GridPane getView() {
		return view;
	}

	public void setView(GridPane view) {
		this.view = view;
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
