package br.com.model;

public class Pais {
	private Integer paisId;
	private String nome;
	private String sigla;

	public Pais() {
	}

	public Pais(Integer paisId) {
		this.paisId = paisId;
	}

	public Integer getPaisId() {
		return this.paisId;
	}

	public void setPaisId(Integer paisId) {
		this.paisId = paisId;
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
