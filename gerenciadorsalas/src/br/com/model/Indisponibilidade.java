package br.com.model;

import java.util.Date;

public class Indisponibilidade {
	private Integer indisponibilidadeId;
	private Sala sala;
	private String motivo;
	private Date inicio;
	private Date fim;
	private boolean remove;

	public boolean isRemove() {
		return this.remove;
	}

	public void setRemove(boolean remove) {
		this.remove = remove;
	}

	public Indisponibilidade() {
	}

	public Indisponibilidade(Integer indisponibilidadeId, Sala sala, String motivo, Date inicio, Date fim) {
		this.indisponibilidadeId = indisponibilidadeId;
		this.sala = sala;
		this.motivo = motivo;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getIndisponibilidadeId() {
		return this.indisponibilidadeId;
	}

	public void setIndisponibilidadeId(Integer indisponibilidadeId) {
		this.indisponibilidadeId = indisponibilidadeId;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
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
}
