package br.com.model;

public class Municipio {
	private Integer municipioId;
	private String nome;
	private Uf uf;

	public Municipio() {
	}

	public Municipio(Integer municipioId) {
		this.municipioId = municipioId;
	}

	public Integer getMunicipioId() {
		return this.municipioId;
	}

	public void setMunicipioId(Integer municipioId) {
		this.municipioId = municipioId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Uf getUf() {
		return this.uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}
}
