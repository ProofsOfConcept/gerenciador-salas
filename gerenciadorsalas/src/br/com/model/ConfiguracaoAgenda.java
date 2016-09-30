package br.com.model;

import java.util.List;

import br.com.model.enums.Tipo;

public class ConfiguracaoAgenda {
	private Integer configuracaoAgendaId;
	private String portletId;
	private Organizacao organizacaoRestrita;
	private String nomeRemetente;
	private String emailRemetente;
	private String destinatarios;
	private List<Sala> salas;
	private List<Tipo> tipos;

	public ConfiguracaoAgenda() {
	}

	public ConfiguracaoAgenda(Integer configuracaoAgendaId) {
		this.configuracaoAgendaId = configuracaoAgendaId;
	}

	public Integer getConfiguracaoAgendaId() {
		return this.configuracaoAgendaId;
	}

	public void setConfiguracaoAgendaId(Integer configuracaoAgendaId) {
		this.configuracaoAgendaId = configuracaoAgendaId;
	}

	public String getPortletId() {
		return this.portletId;
	}

	public void setPortletId(String portletId) {
		this.portletId = portletId;
	}

	public Organizacao getOrganizacaoRestrita() {
		return this.organizacaoRestrita;
	}

	public void setOrganizacaoRestrita(Organizacao organizacaoRestrita) {
		this.organizacaoRestrita = organizacaoRestrita;
	}

	public String getNomeRemetente() {
		return this.nomeRemetente;
	}

	public void setNomeRemetente(String nomeRemetente) {
		this.nomeRemetente = nomeRemetente;
	}

	public String getEmailRemetente() {
		return this.emailRemetente;
	}

	public void setEmailRemetente(String emailRemetente) {
		this.emailRemetente = emailRemetente;
	}

	public String getDestinatarios() {
		return this.destinatarios;
	}

	public void setDestinatarios(String destinatarios) {
		this.destinatarios = destinatarios;
	}

	public List<Sala> getSalas() {
		return this.salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	public List<Tipo> getTipos() {
		return this.tipos;
	}
}
