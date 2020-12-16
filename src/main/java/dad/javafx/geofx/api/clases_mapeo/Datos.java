package dad.javafx.geofx.api.clases_mapeo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ip", "hostname", "type", "continent_code", "continent_name", "country_code", "country_name",
		"region_code", "region_name", "city", "zip", "latitude", "longitude", "location", "time_zone", "currency",
		"connection", "security" })
public class Datos {

	@JsonProperty("ip")
	private String ip;
	@JsonProperty("hostname")
	private String hostname;
	@JsonProperty("type")
	private String type;
	@JsonProperty("continent_code")
	private String continentCode;
	@JsonProperty("continent_name")
	private String continentName;
	@JsonProperty("country_code")
	private String countryCode;
	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("region_code")
	private String regionCode;
	@JsonProperty("region_name")
	private String regionName;
	@JsonProperty("city")
	private String city;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("latitude")
	private Double latitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("location")
	private Location location;
	@JsonProperty("time_zone")
	private TimeZone timeZone;
	@JsonProperty("currency")
	private Currency currency;
	@JsonProperty("connection")
	private Connection connection;
	@JsonProperty("security")
	private Security security;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ip")
	public String getIp() {
		return ip;
	}

	@JsonProperty("ip")
	public void setIp(String ip) {
		this.ip = ip;
	}

	public Datos withIp(String ip) {
		this.ip = ip;
		return this;
	}

	@JsonProperty("hostname")
	public String getHostname() {
		return hostname;
	}

	@JsonProperty("hostname")
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Datos withHostname(String hostname) {
		this.hostname = hostname;
		return this;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public Datos withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("continent_code")
	public String getContinentCode() {
		return continentCode;
	}

	@JsonProperty("continent_code")
	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public Datos withContinentCode(String continentCode) {
		this.continentCode = continentCode;
		return this;
	}

	@JsonProperty("continent_name")
	public String getContinentName() {
		return continentName;
	}

	@JsonProperty("continent_name")
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public Datos withContinentName(String continentName) {
		this.continentName = continentName;
		return this;
	}

	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("country_code")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Datos withCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	@JsonProperty("country_name")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("country_name")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Datos withCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	@JsonProperty("region_code")
	public String getRegionCode() {
		return regionCode;
	}

	@JsonProperty("region_code")
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public Datos withRegionCode(String regionCode) {
		this.regionCode = regionCode;
		return this;
	}

	@JsonProperty("region_name")
	public String getRegionName() {
		return regionName;
	}

	@JsonProperty("region_name")
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Datos withRegionName(String regionName) {
		this.regionName = regionName;
		return this;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	public Datos withCity(String city) {
		this.city = city;
		return this;
	}

	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(String zip) {
		this.zip = zip;
	}

	public Datos withZip(String zip) {
		this.zip = zip;
		return this;
	}

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Datos withLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Datos withLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	@JsonProperty("location")
	public Location getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(Location location) {
		this.location = location;
	}

	public Datos withLocation(Location location) {
		this.location = location;
		return this;
	}

	@JsonProperty("time_zone")
	public TimeZone getTimeZone() {
		return timeZone;
	}

	@JsonProperty("time_zone")
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Datos withTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
		return this;
	}

	@JsonProperty("currency")
	public Currency getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Datos withCurrency(Currency currency) {
		this.currency = currency;
		return this;
	}

	@JsonProperty("connection")
	public Connection getConnection() {
		return connection;
	}

	@JsonProperty("connection")
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Datos withConnection(Connection connection) {
		this.connection = connection;
		return this;
	}

	@JsonProperty("security")
	public Security getSecurity() {
		return security;
	}

	@JsonProperty("security")
	public void setSecurity(Security security) {
		this.security = security;
	}

	public Datos withSecurity(Security security) {
		this.security = security;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Datos withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}