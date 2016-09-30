package br.com.model;

public class Franquia {
	private Integer franquiaId;
	private String nome;

	public Franquia() {
	}

	public Franquia(Integer franquiaId) {
		this.franquiaId = franquiaId;
	}

	public Integer getFranquiaId() {
		return this.franquiaId;
	}

	public void setFranquiaId(Integer franquiaId) {
		this.franquiaId = franquiaId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
