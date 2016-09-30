package br.com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import br.com.business.ReservaBusiness;
import br.com.business.SalaBusiness;
import br.com.model.Reserva;
import br.com.model.Sala;

@Path("/agenda")
public class AgendaService {
	
	@GET
	@Path("/salas")
	public Response getSalas() {
		SalaBusiness business = new SalaBusiness();
		List<Sala> salas = business.getSalas();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("salas", salas);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/salas/{orgId}/{instId}")
	public Response getSalas(@PathParam("orgId") String orgId, @PathParam("instId") String instId) {
		SalaBusiness business = new SalaBusiness();
		List<Sala> salas = business.getSalas(orgId, instId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("salas", salas);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Consumes({MediaType.TEXT_PLAIN})
	@Path("/minhas-salas/{userId}")
	public Response getMinhasSalas(@PathParam("userId") String userId) {
		SalaBusiness business = new SalaBusiness();
		List<Sala> salas = business.getMinhasSalas(userId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("salas", salas);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Consumes({MediaType.TEXT_PLAIN})
	@Path("/salas-participando/{userId}")
	public Response getSalasParticipando(@PathParam("userId") String userId) {
		SalaBusiness business = new SalaBusiness();
		List<Sala> salas = business.getSalasParticipando(userId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("salas", salas);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Consumes({MediaType.TEXT_PLAIN})
	@Path("/reservas/{orgId}/{instId}")
	public Response getReservas(@PathParam("orgId") String orgId, @PathParam("instId") String instId) {
		
		ReservaBusiness business = new ReservaBusiness();
		List<Reserva> reservas = business.getReservas(orgId, instId);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("reservas", reservas);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
