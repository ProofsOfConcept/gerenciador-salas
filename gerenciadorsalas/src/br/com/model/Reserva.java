package br.com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
	private Integer reservaId;
	private Sala sala;
	private Date inicio;
	private Date fim;
	private Date dataSolicitacao;
	private String titulo;
	private String participantes;
	private List<Usuario> listaParticipantes = new ArrayList<Usuario>();
	private Boolean informacoesRestritas;
	private Boolean requerGravacao;
	private String status;
	private Justificativa justificativa;
	private Usuario usuarioSolicitante;
	private Usuario usuarioAprovador;
	private Integer franquiaUtilizadaId;
	private Integer uuid;
	private Boolean feriado;
	private String recursoMCU;
	private Sala salaVirtual;

	public Reserva(Sala sala, Date inicio, Date fim, String titulo, String participantes, Boolean informacoesRestritas,
			Boolean requerGravacao, String status, Usuario usuarioSolicitante) {
		this.sala = sala;
		this.inicio = inicio;
		this.fim = fim;
		this.titulo = titulo;
		this.participantes = participantes;
		this.informacoesRestritas = informacoesRestritas;
		this.requerGravacao = requerGravacao;
		this.status = status;
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public Reserva(Sala sala, Date inicio, Date fim, Date dataSolicitacao, String titulo, String participantes,
			Boolean informacoesRestritas, Boolean requerGravacao, String status, Usuario usuarioSolicitante) {
		this.sala = sala;
		this.inicio = inicio;
		this.fim = fim;
		this.dataSolicitacao = dataSolicitacao;
		this.titulo = titulo;
		this.participantes = participantes;
		this.informacoesRestritas = informacoesRestritas;
		this.requerGravacao = requerGravacao;
		this.status = status;
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public Reserva(Integer reservaId) {
		this.reservaId = reservaId;
	}

	public Reserva() {
	}

	public Integer getReservaId() {
		return this.reservaId;
	}

	public void setReservaId(Integer reservaId) {
		this.reservaId = reservaId;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Date getInicio() {
		return this.inicio;
	}
	
	public Long getInicioTime() {
		return this.inicio.getTime();
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Long getFimTime() {
		return this.fim.getTime();
	}
	
	public Date getFim() {
		return this.fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getParticipantes() {
		return this.participantes;
	}

	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}

	public Boolean getInformacoesRestritas() {
		return this.informacoesRestritas;
	}

	public void setInformacoesRestritas(Boolean informacoesRestritas) {
		this.informacoesRestritas = informacoesRestritas;
	}

	public Boolean getRequerGravacao() {
		return this.requerGravacao;
	}

	public void setRequerGravacao(Boolean requerGravacao) {
		this.requerGravacao = requerGravacao;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Justificativa getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(Justificativa justificativa) {
		this.justificativa = justificativa;
	}

	public Usuario getUsuarioSolicitante() {
		return this.usuarioSolicitante;
	}

	public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public Usuario getUsuarioAprovador() {
		return this.usuarioAprovador;
	}

	public void setUsuarioAprovador(Usuario usuarioAprovador) {
		this.usuarioAprovador = usuarioAprovador;
	}

	public Long getDataSolicitacaoTime() {
		return this.dataSolicitacao.getTime();
	}
	
	public Date getDataSolicitacao() {
		return this.dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Integer getFranquiaUtilizadaId() {
		return this.franquiaUtilizadaId;
	}

	public void setFranquiaUtilizadaId(Integer franquiaUtilizadaId) {
		this.franquiaUtilizadaId = franquiaUtilizadaId;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public Integer getUuid() {
		return this.uuid;
	}

	public Boolean getFeriado() {
		return this.feriado;
	}

	public void setFeriado(Boolean feriado) {
		this.feriado = feriado;
	}

	public void setRecursoMCU(String recursoMCU) {
		this.recursoMCU = recursoMCU;
	}

	public String getRecursoMCU() {
		return this.recursoMCU;
	}

	public Sala getSalaVirtual() {
		return this.salaVirtual;
	}

	public void setSalaVirtual(Sala salaVirtual) {
		this.salaVirtual = salaVirtual;
	}

	public List<Usuario> getListaParticipantes() {
		if(listaParticipantes == null) {
			return new ArrayList<Usuario>();
		} else {
			return listaParticipantes;
		}
	}

	public void setListaParticipantes(List<Usuario> listaParticipantes) {
		String separator = "";
		for (Usuario usuario : listaParticipantes) {
			this.participantes += (separator + usuario.getNome());
			separator = ", ";
		}
		this.listaParticipantes = listaParticipantes;
	}
}
