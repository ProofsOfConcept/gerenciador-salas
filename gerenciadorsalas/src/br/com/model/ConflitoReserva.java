package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class ConflitoReserva {
	Integer salaId;
	String salaNome;
	String salaTipo;
	String conflitos;
	List<ConflitoUso> usos = new ArrayList<ConflitoUso>();
	String feriado;
	String limiteMaximo;
	String indisponibilidade;
	String franquia;
	String diaHoraIndisponivel;

	public ConflitoReserva() {
	}

	public ConflitoReserva(Integer salaId, String salaNome, String salaTipo, String conflitos, List<ConflitoUso> usos,
			String feriado, String limiteMaximo, String indisponibilidade, String franquia,
			String diaHoraIndisponivel) {
		this.salaId = salaId;
		this.salaNome = salaNome;
		this.salaTipo = salaTipo;
		this.conflitos = conflitos;
		this.usos = usos;
		this.feriado = feriado;
		this.limiteMaximo = limiteMaximo;
		this.indisponibilidade = indisponibilidade;
		this.franquia = franquia;
		this.diaHoraIndisponivel = diaHoraIndisponivel;
	}

	public String getConflitos() {
		return this.conflitos;
	}

	public void setConflitos(String conflitos) {
		this.conflitos = conflitos;
	}

	public String getFeriado() {
		return this.feriado;
	}

	public void setFeriado(String feriado) {
		this.feriado = feriado;
	}

	public String getLimiteMaximo() {
		return this.limiteMaximo;
	}

	public void setLimiteMaximo(String limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}

	public String getIndisponibilidade() {
		return this.indisponibilidade;
	}

	public void setIndisponibilidade(String indisponibilidade) {
		this.indisponibilidade = indisponibilidade;
	}

	public String getFranquia() {
		return this.franquia;
	}

	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}

	public Integer getSalaId() {
		return this.salaId;
	}

	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	public String getSalaNome() {
		return this.salaNome;
	}

	public void setSalaNome(String salaNome) {
		this.salaNome = salaNome;
	}

	public String getSalaTipo() {
		return this.salaTipo;
	}

	public void setSalaTipo(String salaTipo) {
		this.salaTipo = salaTipo;
	}

	public List<ConflitoUso> getUsos() {
		return this.usos;
	}

	public void setUsos(List<ConflitoUso> usos) {
		this.usos = usos;
	}

	public String getDiaHoraIndisponivel() {
		return this.diaHoraIndisponivel;
	}

	public void setDiaHoraIndisponivel(String diaHoraIndisponivel) {
		this.diaHoraIndisponivel = diaHoraIndisponivel;
	}
}
