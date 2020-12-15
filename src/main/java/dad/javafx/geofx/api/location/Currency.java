package dad.javafx.geofx.api.location;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "name", "plural", "symbol", "symbol_native" })
public class Currency {

	@JsonProperty("code")
	private String code;
	@JsonProperty("name")
	private String name;
	@JsonProperty("plural")
	private String plural;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("symbol_native")
	private String symbolNative;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public Currency withCode(String code) {
		this.code = code;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Currency withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("plural")
	public String getPlural() {
		return plural;
	}

	@JsonProperty("plural")
	public void setPlural(String plural) {
		this.plural = plural;
	}

	public Currency withPlural(String plural) {
		this.plural = plural;
		return this;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Currency withSymbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	@JsonProperty("symbol_native")
	public String getSymbolNative() {
		return symbolNative;
	}

	@JsonProperty("symbol_native")
	public void setSymbolNative(String symbolNative) {
		this.symbolNative = symbolNative;
	}

	public Currency withSymbolNative(String symbolNative) {
		this.symbolNative = symbolNative;
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

	public Currency withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}