package br.com.business;

import javax.naming.ldap.LdapContext;

import br.com.utils.LdapAuthenticator;

public class Login {
	public String logarUsuario(String nome, String senha) {
		String msgRetorno = "";
		
		String userEBT = LdapAuthenticator.getDadosUsuarioEBT(nome);
		LdapContext authContEmbratel = LdapAuthenticator.validaUsuario(userEBT, senha);
		
		if(authContEmbratel != null) {
			msgRetorno = "OK";
		} else {
			msgRetorno = "Usuário não autorizado";
		}
		
		return msgRetorno;
	}
}
