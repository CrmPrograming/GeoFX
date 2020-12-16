package dad.javafx.geofx.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Security {

	private StringProperty info = new SimpleStringProperty();
	private BooleanProperty proxy = new SimpleBooleanProperty();
	private BooleanProperty tor = new SimpleBooleanProperty();
	private BooleanProperty crawler = new SimpleBooleanProperty();
	private StringProperty threatLevel = new SimpleStringProperty();
	private StringProperty potentialThreats = new SimpleStringProperty();

	public final StringProperty infoProperty() {
		return this.info;
	}

	public final String getInfo() {
		return this.infoProperty().get();
	}

	public final void setInfo(final String info) {
		this.infoProperty().set(info);
	}

	public final BooleanProperty proxyProperty() {
		return this.proxy;
	}

	public final boolean isProxy() {
		return this.proxyProperty().get();
	}

	public final void setProxy(final boolean proxy) {
		this.proxyProperty().set(proxy);
	}

	public final BooleanProperty torProperty() {
		return this.tor;
	}

	public final boolean isTor() {
		return this.torProperty().get();
	}

	public final void setTor(final boolean tor) {
		this.torProperty().set(tor);
	}

	public final BooleanProperty crawlerProperty() {
		return this.crawler;
	}

	public final boolean isCrawler() {
		return this.crawlerProperty().get();
	}

	public final void setCrawler(final boolean crawler) {
		this.crawlerProperty().set(crawler);
	}

	public final StringProperty threatLevelProperty() {
		return this.threatLevel;
	}

	public final String getThreatLevel() {
		return this.threatLevelProperty().get();
	}

	public final void setThreatLevel(final String threatLevel) {
		this.threatLevelProperty().set(threatLevel);
	}

	public final StringProperty potentialThreatsProperty() {
		return this.potentialThreats;
	}

	public final String getPotentialThreats() {
		return this.potentialThreatsProperty().get();
	}

	public final void setPotentialThreats(final String potentialThreats) {
		this.potentialThreatsProperty().set(potentialThreats);
	}

}
