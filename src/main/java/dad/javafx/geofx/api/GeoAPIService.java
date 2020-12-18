package dad.javafx.geofx.api;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.api.clases_mapeo.Datos;

public class GeoAPIService {

	public GeoAPIService() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}

	public IP obtenerIpPublica() throws UnirestException {
		return Unirest.get("https://api.ipify.org?format=json").asObject(IP.class).getBody();
	}

	public Datos obtenerLocation(String ipDestino) throws UnirestException {
		return Unirest.get(
				"http://ipapi.com/ip_api.php?ip={ip_destino}")
				.routeParam("ip_destino", ipDestino)
				.asObject(Datos.class).getBody();
	}

}
