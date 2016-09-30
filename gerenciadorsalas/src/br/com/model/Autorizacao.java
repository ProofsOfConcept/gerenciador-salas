package br.com.model;

public class Autorizacao {
	private Integer autorizacaoId;
	private String nome;

	public Autorizacao() {
	}

	public Autorizacao(Integer autorizacaoId) {
		this.autorizacaoId = autorizacaoId;
	}

	public Integer getAutorizacaoId() {
		return this.autorizacaoId;
	}

	public void setAutorizacaoId(Integer autorizacaoId) {
		this.autorizacaoId = autorizacaoId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
