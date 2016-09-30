package br.com.model;

public class DiaSemana {
	private Integer diaId;
	private String nome;

	public DiaSemana() {
	}

	public DiaSemana(Integer diaId) {
		this.diaId = diaId;
	}

	public Integer getDiaId() {
		return this.diaId;
	}

	public void setDiaId(Integer diaId) {
		this.diaId = diaId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
