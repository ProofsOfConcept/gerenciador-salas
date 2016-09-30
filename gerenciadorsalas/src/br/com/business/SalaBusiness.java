package br.com.business;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Endereco;
import br.com.model.Instituicao;
import br.com.model.OrgInstUser;
import br.com.model.Organizacao;
import br.com.model.Responsavel;
import br.com.model.Sala;
import br.com.model.Usuario;
import br.com.model.enums.Tipo;
import br.com.utils.Paleta;

public class SalaBusiness {
	public List<Sala> getMinhasSalas(String userId) {
		List<Sala> salas = new ArrayList<Sala>();
		Organizacao org = new Organizacao();
		org.setSigla("EBT");
		Instituicao inst = new Instituicao();
		inst.setSigla("Rio III");
		
		List<Responsavel> responsaveis = new ArrayList<Responsavel>();
		Responsavel responsavel = new Responsavel();
		OrgInstUser orgInstUser = new OrgInstUser();
		Usuario usuario = new Usuario();
		usuario.setNome("HISILVA");
		orgInstUser.setUsuario(usuario);
		responsavel.setOrgInstUser(orgInstUser);
		responsaveis.add(responsavel);
		
		for(int i = 0; i < 5; i++) {
			Sala sala = new Sala();
			sala.setSalaId(i + 1);
			sala.setNome(String.valueOf(400 + i));
			sala.setOrganizacao(org);
			sala.setInstituicao(inst);
			sala.setCor(Paleta.getCor(sala.getSalaId()));
			Endereco endereco = new Endereco();
			endereco.setComplemento("4º Andar");
			sala.setEndereco(endereco);
			sala.setVisivel(true);
			sala.setResponsaveis(responsaveis);
			sala.setTipo(Tipo.PRESENCIAL.ordinal());
			salas.add(sala);
		}
		return salas;
	}
	
	public List<Sala> getSalas() {
		List<Sala> salas = new ArrayList<Sala>();
		Organizacao org = new Organizacao();
		org.setSigla("EBT");
		Instituicao inst = new Instituicao();
		inst.setSigla("Rio III");
		for(int i = 0; i < 10; i++) {
			Sala sala = new Sala();
			sala.setSalaId(i + 1);
			sala.setNome(String.valueOf(400 + i));
			sala.setOrganizacao(org);
			sala.setInstituicao(inst);
			sala.setCor(Paleta.getCor(sala.getSalaId()));
			Endereco endereco = new Endereco();
			endereco.setComplemento("4º Andar");
			sala.setEndereco(endereco);
			sala.setVisivel(true);
			salas.add(sala);
		}
		return salas;
	}
	
	public List<Sala> getSalas(String orgId, String instId) {
		List<Sala> salas = new ArrayList<Sala>();
		Organizacao org = new Organizacao();
		org.setSigla("EBT");
		Instituicao inst = new Instituicao();
		inst.setSigla("Rio III");
		for(int i = 0; i < 10; i++) {
			Sala sala = new Sala();
			sala.setSalaId(i + 1);
			sala.setNome(String.valueOf(400 + i));
			sala.setOrganizacao(org);
			sala.setInstituicao(inst);
			sala.setCor(Paleta.getCor(sala.getSalaId()));
			Endereco endereco = new Endereco();
			endereco.setComplemento("4º Andar");
			sala.setEndereco(endereco);
			sala.setVisivel(true);
			salas.add(sala);
		}
		return salas;
	}

	public List<Sala> getSalasParticipando(String userId) {
		List<Sala> salas = new ArrayList<Sala>();
		return salas;
	}
}
