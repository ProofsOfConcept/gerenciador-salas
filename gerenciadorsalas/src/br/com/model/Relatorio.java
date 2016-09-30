package br.com.model;

import java.util.Date;

public class Relatorio {
	private Integer reservaId;
	private Date solicitacao;
	private Date inicio;
	private Date fim;
	private String titulo;
	private String participantes;
	private Boolean informacoesRestritas;
	private Boolean requerGravacao;
	private String nomeSolicitante;
	private String organizacaoSolicitante;
	private String instituicaoSolicitante;
	private String nomeSala;
	private String organizacaoSala;
	private String instituicaoSala;
	private String tipoSala;
	private String mcu;

	public Relatorio() {
	}

	public Relatorio(Integer reservaId, Date solicitacao, Date inicio, Date fim, String titulo, String participantes,
			Boolean informacoesRestritas, Boolean requerGravacao, String nomeSolicitante, String organizacaoSolicitante,
			String instituicaoSolicitante, String nomeSala, String organizacaoSala, String instituicaoSala,
			String tipoSala, String mcu) {
		this.reservaId = reservaId;
		this.solicitacao = solicitacao;
		this.inicio = inicio;
		this.fim = fim;
		this.titulo = titulo;
		this.participantes = participantes;
		this.informacoesRestritas = informacoesRestritas;
		this.requerGravacao = requerGravacao;
		this.nomeSolicitante = nomeSolicitante;
		this.organizacaoSolicitante = organizacaoSolicitante;
		this.instituicaoSolicitante = instituicaoSolicitante;
		this.nomeSala = nomeSala;
		this.organizacaoSala = organizacaoSala;
		this.instituicaoSala = instituicaoSala;
		this.tipoSala = tipoSala;
		this.mcu = mcu;
	}

	public Integer getReservaId() {
		return this.reservaId;
	}

	public void setReservaId(Integer reservaId) {
		this.reservaId = reservaId;
	}

	public Date getSolicitacao() {
		return this.solicitacao;
	}

	public void setSolicitacao(Date solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Date getInicio() {
		return this.inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return this.fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getParticipantes() {
		return this.participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	public Boolean getInformacoesRestritas() {
		return this.informacoesRestritas;
	}

	public void setInformacoesRestritas(Boolean informacoesRestritas) {
		this.informacoesRestritas = informacoesRestritas;
	}

	public Boolean getRequerGravacao() {
		return this.requerGravacao;
	}

	public void setRequerGravacao(Boolean requerGravacao) {
		this.requerGravacao = requerGravacao;
	}

	public String getNomeSolicitante() {
		return this.nomeSolicitante;
	}

	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}

	public String getOrganizacaoSolicitante() {
		return this.organizacaoSolicitante;
	}

	public void setOrganizacaoSolicitante(String organizacaoSolicitante) {
		this.organizacaoSolicitante = organizacaoSolicitante;
	}

	public String getInstituicaoSolicitante() {
		return this.instituicaoSolicitante;
	}

	public void setInstituicaoSolicitante(String instituicaoSolicitante) {
		this.instituicaoSolicitante = instituicaoSolicitante;
	}

	public String getNomeSala() {
		return this.nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public String getOrganizacaoSala() {
		return this.organizacaoSala;
	}

	public void setOrganizacaoSala(String organizacaoSala) {
		this.organizacaoSala = organizacaoSala;
	}

	public String getInstituicaoSala() {
		return this.instituicaoSala;
	}

	public void setInstituicaoSala(String instituicaoSala) {
		this.instituicaoSala = instituicaoSala;
	}

	public String getTipoSala() {
		return this.tipoSala;
	}

	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}

	public String getMcu() {
		return this.mcu;
	}

	public void setMcu(String mcu) {
		this.mcu = mcu;
	}
}
