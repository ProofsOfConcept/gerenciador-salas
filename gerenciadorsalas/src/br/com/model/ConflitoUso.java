package br.com.model;

public class ConflitoUso {
	String solicitante;
	String organizacao;
	String instituicao;
	Boolean informacoesRestritas;
	String periodo;

	public ConflitoUso() {
	}

	public ConflitoUso(String solicitante, String organizacao, String instituicao, Boolean informacoesRestritas,
			String periodo) {
		this.solicitante = solicitante;
		this.organizacao = organizacao;
		this.instituicao = instituicao;
		this.informacoesRestritas = informacoesRestritas;
		this.periodo = periodo;
	}

	public String getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getOrganizacao() {
		return this.organizacao;
	}

	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}

	public String getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Boolean getInformacoesRestritas() {
		return this.informacoesRestritas;
	}

	public void setInformacoesRestritas(Boolean informacoesRestritas) {
		this.informacoesRestritas = informacoesRestritas;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
}
