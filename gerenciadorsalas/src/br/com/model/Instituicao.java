package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {
	private Integer instituicaoId;
	private String sigla;
	private String nome;
	private Boolean ativa;
	private Integer intranetId;
	private List<Organizacao> organizacoes;

	public Instituicao() {
	}

	public Instituicao(Integer instituicaoId) {
		this.instituicaoId = instituicaoId;
	}

	public Integer getIntranetId() {
		return this.intranetId;
	}

	public void setIntranetId(Integer intranetId) {
		this.intranetId = intranetId;
	}

	public Integer getInstituicaoId() {
		return this.instituicaoId;
	}

	public void setInstituicaoId(Integer instituicaoId) {
		this.instituicaoId = instituicaoId;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtiva() {
		return this.ativa;
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	public List<Organizacao> getOrganizacoes() {
		return this.organizacoes;
	}

	public void setOrganizacoes(List<Organizacao> organizacoes) {
		this.organizacoes = organizacoes;
	}

	public void addOrganizacao(Organizacao org) {
		if (this.organizacoes == null) {
			this.organizacoes = new ArrayList<Organizacao>();
		}

		this.organizacoes.add(org);
	}

	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
