package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Organizacao {
	private Integer organizacaoId;
	private String sigla;
	private String nome;
	private Boolean ativa;
	private Integer intranetId;
	private List<Instituicao> instituicoes;

	public Organizacao() {
	}

	public Organizacao(Integer organizacaoId) {
		this.organizacaoId = organizacaoId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOrganizacaoId() {
		return this.organizacaoId;
	}

	public void setOrganizacaoId(Integer organizacaoId) {
		this.organizacaoId = organizacaoId;
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Boolean getAtiva() {
		return this.ativa;
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	public Integer getIntranetId() {
		return this.intranetId;
	}

	public void setIntranetId(Integer intranetId) {
		this.intranetId = intranetId;
	}

	public List<Instituicao> getInstituicoes() {
		return this.instituicoes;
	}

	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}

	public void addInstituicao(Instituicao inst) {
		if (this.instituicoes == null) {
			this.instituicoes = new ArrayList<Instituicao>();
		}

		this.instituicoes.add(inst);
	}
}
