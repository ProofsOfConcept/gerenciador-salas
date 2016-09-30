package br.com.utils;

import java.util.Hashtable;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class LdapAuthenticator {

	// Constantes com os dados do Servidor AD
	public static final String SEARCHBASE_EBT = "OU=usuarios,DC=nt,DC=embratel,DC=com,DC=br";
	private static final String USUARIO_AD_EBT = "SD2AIGC0AD";// "SD3APSAADS";
	private static final String SENHA_AD_EBT = "Kld59fHf1dE3s2";// "Gid21vuf";

	public static LdapContext getAuthorizationLDAP_EBT(String pUsername,
			String pSenha) throws NamingException, AuthenticationException {

		Hashtable<String, String> authEnv = new Hashtable<String, String>(11);
		authEnv.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.PROVIDER_URL, "ldap://nt.embratel.com.br:389");
		authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
		authEnv.put(LdapContext.CONTROL_FACTORIES,
				"com.sun.jndi.ldap.ControlFactory");
		authEnv.put(InitialContext.INITIAL_CONTEXT_FACTORY,
				"com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.STATE_FACTORIES, "PersonStateFactory");
		authEnv.put(Context.OBJECT_FACTORIES, "PersonObjectFactory");
		authEnv.put(Context.REFERRAL, "follow");
		authEnv.put("java.naming.ldap.attributes.binary",
				"objectGUID objectSid msSFUPassword");
		authEnv.put(Context.SECURITY_PRINCIPAL, pUsername + "@EMBRATEL");
		authEnv.put(Context.SECURITY_CREDENTIALS, pSenha);
		LdapContext authContext = new InitialLdapContext(authEnv, null);

		return authContext != null ? authContext : null;
	}

	public static String getDadosUsuarioEBT(String pUserName) {
		// Utilizado o AD para autorizar o usuario
		LdapContext authCont;
		SearchControls searchCtls = new SearchControls();
		String nomeUsuario = null;
		try {
			// Loga no AD Utilizando a Conta Criada para a aplicacao
			authCont = LdapAuthenticator.getAuthorizationLDAP_EBT(
					USUARIO_AD_EBT, SENHA_AD_EBT);
			if ((authCont != null)) { // Se logou com sucesso
				searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
				String searchFilter = "(sAMAccountName=" + pUserName.toUpperCase() + ")";

				// Busco pelo Login (login do email)
				NamingEnumeration<SearchResult> resultado = authCont.search(SEARCHBASE_EBT,searchFilter, searchCtls);
				// se possui algum resultado
				if (resultado.hasMoreElements()) {
					while (resultado.hasMore()) {
						SearchResult sr = resultado.next();
						Attributes attrs = sr.getAttributes();
						if (attrs.get("sAMAccountName") != null) {
							nomeUsuario = attrs.get("sAMAccountName").get().toString();
						}
					}
				} else {
					//Usuário inexistente ou não localizado no AD
				}
			} else {
				//Usuário AD não localizado ou não autorizado > ["+ pUserName + "]");
			}
		} catch (AuthenticationException e) {
			//Erro de autenticação no AD. > ["+ pUserName + "]");

		} catch (NamingException e) {

			//Erro de conexão no AD.");
			e.printStackTrace();
		}
		//Retorno do AD [" + nomeUsuario + "]");
		return nomeUsuario;

	}

	public static LdapContext validaUsuario(String pUserName, String pSenha) {

		// Utilizado o AD para autorizar o usuario
		LdapContext authCont = null;
		/*
		SearchControls searchCtls = new SearchControls();
		String nomeUsuario = "";
		*/
		try {
			// Loga no AD Utilizando a Conta Criada para a aplicaï¿½ï¿½o
			authCont = LdapAuthenticator.getAuthorizationLDAP_EBT(pUserName,
					pSenha);
			if ((authCont != null)) { // Se logou com sucesso
				//Logado no Active Directory com SUCESSO > ["+ pUserName + "]");
				// return authCont;
			} else {
				//Usuário ou senha não autorizado no AD");
			}
		} catch (AuthenticationException e) {
			System.err.println("Erro de autenticação no AD com login/senha do usuario.");

		} catch (NamingException e) {
			//Erro de conexão no AD.");
			e.printStackTrace();
		}
		return authCont;
	}


	
}
