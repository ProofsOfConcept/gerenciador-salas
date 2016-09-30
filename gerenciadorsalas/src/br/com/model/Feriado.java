package br.com.model;

import java.util.Date;

public class Feriado {
	private Integer feriadoId;
	private String descricao;
	private Pais pais;
	private Uf uf;
	private Municipio municipio;
	private Date data;
	private Boolean recorrente;
	private Boolean ativo;

	public Feriado() {
	}

	public Feriado(Integer feriadoId) {
		this.feriadoId = feriadoId;
	}

	public Integer getFeriadoId() {
		return this.feriadoId;
	}

	public void setFeriadoId(Integer feriadoId) {
		this.feriadoId = feriadoId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Uf getUf() {
		return this.uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getRecorrente() {
		return this.recorrente;
	}

	public void setRecorrente(Boolean recorrente) {
		this.recorrente = recorrente;
	}

	public Boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
