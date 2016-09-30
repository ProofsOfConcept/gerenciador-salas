package br.com.model;

import java.util.Date;
import java.util.List;

public class Sala {
	private Integer salaId;
	private Organizacao organizacao;
	private Instituicao instituicao;
	private Endereco endereco;
	private String nome;
	private Integer capacidade;
	private Date horaDe;
	private Date horaAte;
	private Integer tipo;
	private Integer visibilidade;
	private Integer limiteMaximo;
	private Boolean salaIntegrada;
	private Boolean ativa;
	private List<DiaSemana> diasUso;
	private List<Autorizacao> autorizacoes;
	private List<FranquiaSala> franquia;
	private List<Reserva> reservas;
	private List<Contato> contatos;
	private List<Responsavel> responsaveis;
	private List<Sala> salasIntegradas;
	private List<Indisponibilidade> indisponibilidades;
	private String cor;
	private Boolean disponivel;
	private Boolean visivel;

	public Sala() {
	}

	public Sala(Integer salaId) {
		this.salaId = salaId;
	}

	public Integer getSalaId() {
		return this.salaId;
	}

	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	public Organizacao getOrganizacao() {
		return this.organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Date getHoraDe() {
		return this.horaDe;
	}

	public void setHoraDe(Date horaDe) {
		this.horaDe = horaDe;
	}

	public Date getHoraAte() {
		return this.horaAte;
	}

	public void setHoraAte(Date horaAte) {
		this.horaAte = horaAte;
	}

	public Integer getTipo() {
		return this.tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getVisibilidade() {
		return this.visibilidade;
	}

	public void setVisibilidade(Integer visibilidade) {
		this.visibilidade = visibilidade;
	}

	public Integer getLimiteMaximo() {
		return this.limiteMaximo;
	}

	public void setLimiteMaximo(Integer limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}

	public Boolean getSalaIntegrada() {
		return this.salaIntegrada;
	}

	public void setSalaIntegrada(Boolean salaIntegrada) {
		this.salaIntegrada = salaIntegrada;
	}

	public Boolean getAtiva() {
		return this.ativa;
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	public List<DiaSemana> getDiasUso() {
		return this.diasUso;
	}

	public void setDiasUso(List<DiaSemana> diasUso) {
		this.diasUso = diasUso;
	}

	public List<Autorizacao> getAutorizacoes() {
		return this.autorizacoes;
	}

	public void setAutorizacoes(List<Autorizacao> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Contato> getContatos() {
		return this.contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public List<Responsavel> getResponsaveis() {
		return this.responsaveis;
	}

	public void setResponsaveis(List<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}

	public List<Sala> getSalasIntegradas() {
		return this.salasIntegradas;
	}

	public void setSalasIntegradas(List<Sala> salasIntegradas) {
		this.salasIntegradas = salasIntegradas;
	}

	public List<FranquiaSala> getFranquia() {
		return this.franquia;
	}

	public void setFranquia(List<FranquiaSala> franquia) {
		this.franquia = franquia;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return String.valueOf(this.salaId);
	}

	public List<Indisponibilidade> getIndisponibilidades() {
		return this.indisponibilidades;
	}

	public void setIndisponibilidades(List<Indisponibilidade> indisponibilidades) {
		this.indisponibilidades = indisponibilidades;
	}

	public Boolean getDisponivel() {
		return this.disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Boolean getVisivel() {
		return visivel;
	}

	public void setVisivel(Boolean visivel) {
		this.visivel = visivel;
	}
}
