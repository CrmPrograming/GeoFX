package dad.javafx.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.model.Connection;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class ConnectionController implements Initializable {

	// model

	private ObjectProperty<Connection> connection = new SimpleObjectProperty<>(new Connection());

	// view

	@FXML
	private GridPane view;

	@FXML
	private Label lbIpAddress;

	@FXML
	private Label lbISP;

	@FXML
	private Label lbType;

	@FXML
	private Label lbASN;

	@FXML
	private Label lbHostname;

	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.connection.addListener((o, ov, nv) -> onConnectionChanged(o, ov, nv));
	}

	private void onConnectionChanged(ObservableValue<? extends Connection> o, Connection ov, Connection nv) {
		if (ov != null) {
			lbIpAddress.textProperty().unbind();
			lbISP.textProperty().unbind();
			lbType.textProperty().unbind();
			Bindings.unbindBidirectional(lbASN.textProperty(), ov.asnProperty());
			lbHostname.textProperty().unbind();
		}

		if (nv != null) {
			lbIpAddress.textProperty().bind(nv.ipAddressProperty());
			lbISP.textProperty().bind(nv.registeredISPProperty());
			lbType.textProperty().bind(nv.typeProperty());
			Bindings.bindBidirectional(lbASN.textProperty(), nv.asnProperty(), new NumberStringConverter());
			lbHostname.textProperty().bind(nv.hostnameProperty());
		}
	}

	public GridPane getView() {
		return view;
	}

	public void setView(GridPane view) {
		this.view = view;
	}

	public final ObjectProperty<Connection> connectionProperty() {
		return this.connection;
	}

	public final Connection getConnection() {
		return this.connectionProperty().get();
	}

	public final void setConnection(final Connection connection) {
		this.connectionProperty().set(connection);
	}

}
