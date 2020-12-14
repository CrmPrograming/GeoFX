package dad.javafx.geofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.controller.LocationController;
import dad.javafx.geofx.model.Geodatos;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {

	// model
	
	private ObjectProperty<Geodatos> geoDatos = new SimpleObjectProperty<>();
	
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
	}
	
	private void onGeoDatosChanged(ObservableValue<? extends Geodatos> o, Geodatos ov, Geodatos nv) {
	
		if (ov != null) {
			locationController.locationProperty().unbind();
		}
		
		if (nv != null) {
			locationController.locationProperty().bind(nv.locationProperty());
		}
	
	}

	public BorderPane getView() {
		return view;
	}

	public void setView(BorderPane view) {
		this.view = view;
	}
	
}
