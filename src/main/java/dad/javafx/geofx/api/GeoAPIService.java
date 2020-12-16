package dad.javafx.geofx.api;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.api.clases_mapeo.Datos;

public class GeoAPIService {

	private final String API_KEY = "0fdc7287c25fdacdc826ea1176736274";

	public GeoAPIService() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}

	public IP obtenerIpPublica() throws UnirestException {
		return Unirest.get("https://api.ipify.org?format=json").asObject(IP.class).getBody();
	}

	public Datos obtenerLocation(String ipDestino) throws UnirestException {
		return Unirest.get(
				"http://api.ipapi.com/{ip_destino}?access_key={access_key}&hostname=1&security=1")
				.routeParam("access_key", API_KEY)
				.routeParam("ip_destino", ipDestino)
				.asObject(Datos.class).getBody();
	}

}
