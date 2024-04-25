package br.com.fiap.DimMoneyAppRm552539;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HomeResource {
	
	@GET
    public String home() {
    	return "Deploy efetuado com sucesso no Servidor Tomcat 10. Bom trabalho!";
    }

}