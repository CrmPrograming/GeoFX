package dad.javafx.geofx.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "ip" })
public class IP {

	@JsonProperty("ip")
	private String ip;

	@JsonProperty("ip")
	public String getIp() {
		return ip;
	}

	@JsonProperty("ip") 
	public void setIp(String ip) {
		this.ip = ip;
	}

}
