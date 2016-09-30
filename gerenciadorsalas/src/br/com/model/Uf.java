package br.com.model;

public class Uf {
	private Integer ufId;
	private String nome;
	private String sigla;
	private Pais pais;

	public Uf() {
	}

	public Uf(Integer ufId) {
		this.ufId = ufId;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Integer getUfId() {
		return this.ufId;
	}

	public void setUfId(Integer ufId) {
		this.ufId = ufId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
