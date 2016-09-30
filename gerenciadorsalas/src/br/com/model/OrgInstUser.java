package br.com.model;

public class OrgInstUser {
	private Integer orgInstUserId;
	private Usuario usuario;
	private Organizacao organizacao;
	private Instituicao instituicao;

	public OrgInstUser() {
	}

	public OrgInstUser(Integer orgInstUserId) {
		this.orgInstUserId = orgInstUserId;
	}

	public Integer getOrgInstUserId() {
		return this.orgInstUserId;
	}

	public void setOrgInstUserId(Integer orgInstUserId) {
		this.orgInstUserId = orgInstUserId;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Organizacao getOrganizacao() {
		return this.organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
}
