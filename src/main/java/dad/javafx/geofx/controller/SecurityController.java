package dad.javafx.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.model.Security;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

	// model

	private ObjectProperty<Security> security = new SimpleObjectProperty<>(new Security());

	// view

	@FXML
	private GridPane view;

	@FXML
	private Label lbInfo;

	@FXML
	private CheckBox cbProxy;

	@FXML
	private CheckBox cbTor;

	@FXML
	private CheckBox cbCrawler;

	@FXML
	private Label lbThreatLevel;

	@FXML
	private Label lbPotentialThreat;

	public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.security.addListener((o, ov, nv) -> onSecurityChanged(o, ov, nv));
	}

	private void onSecurityChanged(ObservableValue<? extends Security> o, Security ov, Security nv) {
		if (ov != null) {
			lbInfo.textProperty().unbind();
			cbProxy.selectedProperty().unbind();
			cbTor.selectedProperty().unbind();
			cbCrawler.selectedProperty().unbind();
			lbThreatLevel.textProperty().unbind();
			lbPotentialThreat.textProperty().unbind();
		}
		
		if (nv != null) {
			lbInfo.textProperty().bind(nv.infoProperty());
			cbProxy.selectedProperty().bind(nv.proxyProperty());
			cbTor.selectedProperty().bind(nv.torProperty());
			cbCrawler.selectedProperty().bind(nv.crawlerProperty());
			lbThreatLevel.textProperty().bind(nv.threatLevelProperty());
			lbPotentialThreat.textProperty().bind(nv.potentialThreatsProperty());
		}
	}

	public GridPane getView() {
		return view;
	}

	public void setView(GridPane view) {
		this.view = view;
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
