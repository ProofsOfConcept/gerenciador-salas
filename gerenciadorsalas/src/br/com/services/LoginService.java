package br.com.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.business.Login;

@Path("/loginservice")
public class LoginService {

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response login(String user) {
		JSONObject jsonUser = new JSONObject(user);
		String usuario = "";
		String senha = "";
		String retorno = "";
		try {
			usuario = (String)jsonUser.get("usuario");
			senha = (String)jsonUser.get("senha");
			if(usuario != null && !"".equals(usuario) && senha != null && !"".equals(senha)) {
				Login loginBusiness = new Login();
				retorno = loginBusiness.logarUsuario(usuario, senha);
			} else {
				retorno = "Usuário ou Senha não preenchidos";
			}
			
		} catch (JSONException e) {
			retorno = "Usuário ou Senha não preenchidos";
		}
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("msgRetorno", retorno);
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
