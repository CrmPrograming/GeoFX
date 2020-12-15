package dad.javafx.geofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.api.GeoAPIService;
import dad.javafx.geofx.controller.LocationController;
import dad.javafx.geofx.model.Geodatos;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {

	// model

	private ObjectProperty<Geodatos> geoDatos = new SimpleObjectProperty<>();
	private GeoAPIService geoApiService = new GeoAPIService();

	// controller

	private LocationController locationController = new LocationController();

	// view

	@FXML
	private BorderPane view;

	@FXML
	private Tab tbLocation;

	@FXML
	private Tab tbConnection;

	@FXML
	private Tab tbSecurity;

	@FXML
	private TextField tfIP;

	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tbLocation.setContent(locationController.getView());

		geoDatos.addListener((o, ov, nv) -> onGeoDatosChanged(o, ov, nv));

		geoDatos.set(new Geodatos());
		
		try {
			comprobarIP();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void onGeoDatosChanged(ObservableValue<? extends Geodatos> o, Geodatos ov, Geodatos nv) {

		if (ov != null) {
			tfIP.textProperty().unbind();
			locationController.locationProperty().unbind();
		}

		if (nv != null) {
			tfIP.textProperty().bindBidirectional(geoDatos.get().ipProperty());
			locationController.locationProperty().bind(nv.locationProperty());
		}

	}

	@FXML
	void onCheckIPAction(ActionEvent event) {
		try {
			comprobarIP();
		} catch (UnirestException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Fallo en el intento de conexión a la api.");
			alert.setContentText("Compruebe que la dirección IP es válida o está bien formada.");
			alert.showAndWait();
		}
	}

	private void comprobarIP() throws UnirestException {
		// Si primera vez que arrancamos la aplicación
		// o el TextField está vacío, buscamos la ip nuestra

		if (geoDatos.get().getIp() == null || geoDatos.get().getIp().equals(""))
			geoDatos.get().setIp(geoApiService.obtenerIpPublica().getIp());
		else
			geoDatos.get().setIp(geoDatos.get().getIp());

		// Sacamos datos de location
		dad.javafx.geofx.api.Localizacion location = geoApiService.obtenerLocation(geoDatos.get().getIp());
		
		geoDatos.get().getLocation().setLatitude(Double.valueOf(location.getLatitude()));
		geoDatos.get().getLocation().setLongitude(Double.valueOf(location.getLongitude()));
		geoDatos.get().getLocation().setIpLocation(location.getCountryName() + " (" + location.getCountryCode() + ")");
		
		geoDatos.get().getLocation().setFlagIcon(new Image("/images/flags/64x42/" + location.getCountryCode() + ".png"));
		
		geoDatos.get().getLocation().setCityState(location.getCity() + " (" + location.getRegionName() + ")");
		geoDatos.get().getLocation().setZipCode(Integer.valueOf(location.getZip()));
		geoDatos.get().getLocation().setLanguage(location.getLocation().getLanguages().get(0).getName() + " (" + location.getCountryCode()  + ")");
		
		if (location.getTimeZone() == null)
			geoDatos.get().getLocation().setTimeZone("VERSIÓN PREMIUM");
		else
			geoDatos.get().getLocation().setTimeZone(location.getTimeZone().getCode());
		
		geoDatos.get().getLocation().setCallingCode("+" + location.getLocation().getCallingCode());
		
		if (location.getCurrency() == null)
			geoDatos.get().getLocation().setCurrency("VERSIÓN PREMIUM");
		else
			geoDatos.get().getLocation().setCurrency(location.getCurrency().getName() + " (" + location.getCurrency().getSymbol() + ")");
		
	}

	public BorderPane getView() {
		return view;
	}

	public void setView(BorderPane view) {
		this.view = view;
	}

}
