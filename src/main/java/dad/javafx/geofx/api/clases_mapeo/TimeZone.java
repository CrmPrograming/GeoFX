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
@JsonPropertyOrder({ "id", "current_time", "gmt_offset", "code", "is_daylight_saving" })
public class TimeZone {

	@JsonProperty("id")
	private String id;
	@JsonProperty("current_time")
	private String currentTime;
	@JsonProperty("gmt_offset")
	private Integer gmtOffset;
	@JsonProperty("code")
	private String code;
	@JsonProperty("is_daylight_saving")
	private Boolean isDaylightSaving;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public TimeZone withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("current_time")
	public String getCurrentTime() {
		return currentTime;
	}

	@JsonProperty("current_time")
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public TimeZone withCurrentTime(String currentTime) {
		this.currentTime = currentTime;
		return this;
	}

	@JsonProperty("gmt_offset")
	public Integer getGmtOffset() {
		return gmtOffset;
	}

	@JsonProperty("gmt_offset")
	public void setGmtOffset(Integer gmtOffset) {
		this.gmtOffset = gmtOffset;
	}

	public TimeZone withGmtOffset(Integer gmtOffset) {
		this.gmtOffset = gmtOffset;
		return this;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public TimeZone withCode(String code) {
		this.code = code;
		return this;
	}

	@JsonProperty("is_daylight_saving")
	public Boolean getIsDaylightSaving() {
		return isDaylightSaving;
	}

	@JsonProperty("is_daylight_saving")
	public void setIsDaylightSaving(Boolean isDaylightSaving) {
		this.isDaylightSaving = isDaylightSaving;
	}

	public TimeZone withIsDaylightSaving(Boolean isDaylightSaving) {
		this.isDaylightSaving = isDaylightSaving;
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

	public TimeZone withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}